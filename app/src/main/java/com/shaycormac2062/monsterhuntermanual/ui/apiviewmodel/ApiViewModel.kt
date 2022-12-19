package com.shaycormac2062.monsterhuntermanual.ui.apiviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shaycormac2062.monsterhuntermanual.domain.interactor.*
import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement
import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.Ailment
import com.shaycormac2062.monsterhuntermanual.domain.model.armor.Armor
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Decoration
import com.shaycormac2062.monsterhuntermanual.domain.model.events.Event
import com.shaycormac2062.monsterhuntermanual.domain.model.monsters.Monster
import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Skill
import com.shaycormac2062.monsterhuntermanual.domain.model.weapons.Weapon
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

open class ApiViewModel<T: BaseElement> @Inject constructor(
    val interactor: BaseInteractor<T>
) : ViewModel() {

    private var _isLoading: MutableStateFlow<ElementsListState<T>> = MutableStateFlow(ElementsListState(true))
    val isLoading: StateFlow<ElementsListState<T>> = _isLoading

    init {
        onPageOpen()
    }

    fun onPageOpen() {
        _isLoading.update { it.copy(isLoading = true) }
        viewModelScope.launch {
            when (val result = interactor.getElements()) {
                is RequestResult.Error -> {
                    _isLoading.update {
                        it.copy(
                            isLoading = false,
                            exception = result.message
                        )
                    }
                }
                else -> {
                    _isLoading.update {
                        it.copy(
                            isLoading = false,
                            elements = result.data
                        )
                    }
                }
            }
        }
    }

    @HiltViewModel
    class AilmentsViewModel @Inject constructor(
        interactor: AilmentsInteractor
    ) : ApiViewModel<Ailment>(interactor)

    @HiltViewModel
    class ArmorViewModel @Inject constructor(
        interactor: ArmorInteractor
    ) : ApiViewModel<Armor>(interactor)

    @HiltViewModel
    class CharmsViewModel @Inject constructor(
        interactor: CharmsInteractor
    ) : ApiViewModel<Charm>(interactor)

    @HiltViewModel
    class DecorationsViewModel @Inject constructor(
        interactor: DecorationsInteractor
    ) : ApiViewModel<Decoration>(interactor)

    @HiltViewModel
    class EventsViewModel @Inject constructor(
        interactor: EventInteractor
    ) : ApiViewModel<Event>(interactor)

    @HiltViewModel
    class MonstersViewModel @Inject constructor(
        interactor: MonsterInteractor
    ) : ApiViewModel<Monster>(interactor)

    @HiltViewModel
    class SkillsViewModel @Inject constructor(
        interactor: SkillsInteractor
    ) : ApiViewModel<Skill>(interactor)

    @HiltViewModel
    class WeaponsViewModel @Inject constructor(
        interactor: WeaponsInteractor
    ) : ApiViewModel<Weapon>(interactor)

}