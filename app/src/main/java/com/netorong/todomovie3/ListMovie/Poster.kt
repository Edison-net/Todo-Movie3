package com.netorong.todomovie3.ListMovie

import android.os.Parcel
import android.os.Parcelable

data class Poster(

    val movie: Int,
    val name: String?,
    val yaer: String?
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(movie)
        parcel.writeString(name)
        parcel.writeString(yaer)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Poster> {
        override fun createFromParcel(parcel: Parcel): Poster {
            return Poster(parcel)
        }

        override fun newArray(size: Int): Array<Poster?> {
            return arrayOfNulls(size)
        }
    }
}
