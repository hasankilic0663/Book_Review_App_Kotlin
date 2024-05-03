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

        val hayvanmezarligi= Landmark("Hayvan Mezarlıgı", "Stephen King",R.drawable.hayvanmezarligi)
        val sefiller =Landmark("Sefiller","Victor Hugo", R.drawable.sefiller)
        val sucveceza=Landmark("Suç ve Ceza","Dostoyevski",R.drawable.sucveceza)







        landmarkList.add(EylulKitabi)
        landmarkList.add(Tutunamayanlar)
        landmarkList.add(hayvanmezarligi)
        landmarkList.add(sefiller)
        landmarkList.add(sucveceza)


        val landmarkAdapter =LandmarkAdapter(landmarkList)


        binding.recycleview.layoutManager=LinearLayoutManager(this)
        binding.recycleview.adapter=landmarkAdapter




    }
}
