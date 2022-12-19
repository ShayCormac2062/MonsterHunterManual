package com.shaycormac2062.monsterhuntermanual.ui.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shaycormac2062.monsterhuntermanual.domain.repository.DataStoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val repository: DataStoreRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : ViewModel() {

    fun saveOnBoardingState(onComplited: Boolean) {
        viewModelScope.launch(dispatcher) {
            repository.saveOnBoardingState(onComplete = onComplited)
        }
    }
}