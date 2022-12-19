package com.shaycormac2062.monsterhuntermanual.ui.splash

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shaycormac2062.monsterhuntermanual.domain.repository.DataStoreRepository
import com.shaycormac2062.monsterhuntermanual.ui.navigation.Screen
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val repository: DataStoreRepository,
    @Named("main") private val dispatcher: CoroutineDispatcher
) : ViewModel() {

    private var _startDestination: MutableState<String> = mutableStateOf(Screen.Splash.route)
    val startDestination: State<String> = _startDestination

    init {
        viewModelScope.launch(dispatcher) {
            delay(1800)
            repository.readOnBoardingState().collect { completed ->
                _startDestination.value = if (completed) {
                    Screen.Main.route
                } else {
                    Screen.OnBoarding.route
                }
            }
        }
    }

}