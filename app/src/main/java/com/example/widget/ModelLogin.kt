package com.example.widget

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelLogin(
    val username : String,
    val password : String
) : Parcelable
