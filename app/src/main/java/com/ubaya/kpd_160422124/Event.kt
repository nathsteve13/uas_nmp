package com.ubaya.kpd_160422124

import android.os.Parcelable

data class Event(val id:Int, var name: String, var description: String, var pictureID: Int, var eventDate: String, var crewNeeded: Int, var crewNumber: Int) : Parcelable {
    override fun toString() = name
}
