package com.hasankilic.book_review_app__kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hasankilic.book_review_app__kotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList=ArrayList<Landmark>()//suan burada boş gözüküyor


        //Data
        val EylulKitabi =Landmark("Eylül","Mehmet Rauf",R.drawable.eylul)
        val Tutunamayanlar = Landmark("Tutunamayanlar","Oğuz Atay",R.drawable.tutunamayanlar)





        landmarkList.add(EylulKitabi)
        landmarkList.add(Tutunamayanlar)


        val landmarkAdapter =LandmarkAdapter(landmarkList)


        binding.recycleview.layoutManager=LinearLayoutManager(this)
        binding.recycleview.adapter=landmarkAdapter




    }
}
