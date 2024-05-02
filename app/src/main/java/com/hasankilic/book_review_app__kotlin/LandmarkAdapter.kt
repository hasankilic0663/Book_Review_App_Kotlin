package com.hasankilic.book_review_app__kotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hasankilic.book_review_app__kotlin.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList : ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {
    class LandmarkHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding =RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)//gorunumu olusturma
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        //gorunumde ne gozukecek onu bakcaz
        holder.binding.recycleViewTextView.text=landmarkList.get(position).name

        holder.itemView.setOnClickListener{
            val intent =Intent(holder.itemView.context,DetailsActivity::class.java)
            //intent.putExtra("landmark",landmarkList.get(position))
            MySingleton.chosenLandmark= landmarkList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {//kaç tane gorunumden olusturulacagı
         return landmarkList.size
    }



}