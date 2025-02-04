package com.alireza.news_app.core.domain

import com.alireza.news_app.core.domain.model.ApiError


sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T) : ResultWrapper<T>()
    data class GenericError(val code: Int? = null, val error: ApiError? = null) : ResultWrapper<Nothing>()

    object NetworkError : ResultWrapper<Nothing>()
}

