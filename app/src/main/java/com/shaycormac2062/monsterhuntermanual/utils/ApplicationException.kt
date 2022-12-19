package com.shaycormac2062.monsterhuntermanual.utils

sealed class ApplicationException(override val message: String) : Exception(message) {

    data class ApiException(override val message: String = API_EXCEPTION)
        : ApplicationException(message)

    data class InternetException(override val message: String = INTERNET_CONNECTION_EXCEPTION)
        : ApplicationException(message)

    companion object {
        const val INTERNET_CONNECTION_EXCEPTION = "No internet connection. Please turn it on and try again."
        const val API_EXCEPTION = "Sorry, problems on the server. Please try again later."
    }
}
