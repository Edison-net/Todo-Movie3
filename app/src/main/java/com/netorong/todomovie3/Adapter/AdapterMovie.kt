package com.netorong.todomovie3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.netorong.todomovie3.ListMovie.Poster
import com.netorong.todomovie3.R

class AdapterMovie(private val context: Context, private val movies:MutableList<Poster>): RecyclerView.Adapter<AdapterMovie.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.movie_item,parent,false)
        val holder = MovieViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.poster.setImageResource(movies[position].movie
        )
        holder.name.text = movies[position].name
        holder.information.text = movies[position].yaer
    }

    override fun getItemCount(): Int = movies.size

    inner class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val poster = itemView.findViewById<ImageView>(R.id.imageView2)
        val name = itemView.findViewById<TextView>(R.id.name1)
        val information = itemView.findViewById<TextView>(R.id.year1)

    }
}

class Contetxt {

}
