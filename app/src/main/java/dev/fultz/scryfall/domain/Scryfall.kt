package dev.fultz.scryfall.domain

import android.os.Parcel
import android.os.Parcelable

data class Scryfall(
    val q: String? = null,
    val id: String? = null,
    val name: String? = null,
    val png: String? = null,
    val oracle_text: String? = null,
    val set_name: String? = null
    ) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(q)
        parcel.writeString(id)
        parcel.writeString(name)
        parcel.writeString(png)
        parcel.writeString(oracle_text)
        parcel.writeString(set_name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Scryfall> {
        override fun createFromParcel(parcel: Parcel): Scryfall {
            return Scryfall(parcel)
        }

        override fun newArray(size: Int): Array<Scryfall?> {
            return arrayOfNulls(size)
        }
    }
}