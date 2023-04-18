package com.example.recyclerviewlist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Inis_Variable(
    val fotomhs: Int=0,
    val Namamhs: String,
    val Nimmhs: String,
    val Telp: String
): Parcelable
