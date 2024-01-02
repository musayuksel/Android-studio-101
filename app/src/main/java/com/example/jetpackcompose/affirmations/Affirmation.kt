package com.example.jetpackcompose.affirmations

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val affirmationStringId: Int,
    @DrawableRes val affirmationImageId:Int
)
