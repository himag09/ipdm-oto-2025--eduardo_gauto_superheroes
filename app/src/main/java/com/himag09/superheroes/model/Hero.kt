package com.himag09.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int
)
