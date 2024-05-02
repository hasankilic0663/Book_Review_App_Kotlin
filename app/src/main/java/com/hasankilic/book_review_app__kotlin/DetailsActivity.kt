package com.hasankilic.book_review_app__kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasankilic.book_review_app__kotlin.databinding.ActivityDetailsBinding
import com.hasankilic.book_review_app__kotlin.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        val intent=intent



        val selectedLandmark=MySingleton.chosenLandmark


        selectedLandmark?.let {
            binding.nameText.text=it.name
            binding.countryText.text= it.country
            binding.imageView.setImageResource(it.image)
        }
}
}
