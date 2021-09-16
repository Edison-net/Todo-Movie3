package com.netorong.todomovie3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.netorong.todomovie3.Adapter.AdapterMovie
import com.netorong.todomovie3.ListMovie.Poster
import com.netorong.todomovie3.R.*

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.movie_item)

        val recyclerView_movie_list = findViewById<RecyclerView>(id.recyclerView_movie_list)
        recyclerView_movie_list.layoutManager = LinearLayoutManager(this)
        recyclerView_movie_list.setHasFixedSize(true)


        val poster: MutableList<Poster> = mutableListOf()
        val adapterMovie = AdapterMovie(this, poster)
        recyclerView_movie_list.adapter = adapterMovie

        val imageView2 = Poster(
            R.drawable.bast_gloria,
            "Inglourius Basterds",
            "2009 War,Action"
        )
        poster.add(imageView2)

        val imageView3 = Poster(
            R.drawable.fight_club,
            "Fight Club",
            "1999 Thriller,Drama"
        )
        poster.add(imageView3)

        val imageView4 = Poster(
            R.drawable.once,
            "Once Upon a Time... in Hollywood",
            "2019 Comedy,Drama"
        )
        poster.add(imageView4)

        val imageView5 = Poster(
            R.drawable.twelve_man,
            "Ocean's Twelve",
            "2004 Crime,Comedy"
        )
        poster.add(imageView5)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}