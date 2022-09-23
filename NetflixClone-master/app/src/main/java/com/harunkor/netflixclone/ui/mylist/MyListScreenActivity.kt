package com.harunkor.netflixclone.ui.mylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.harunkor.netflixclone.R
import com.harunkor.netflixclone.databinding.ActivityMyListScreenBinding
import com.harunkor.netflixclone.databinding.MylistItemBinding

class MyListScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyListScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMyListScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mList = arrayOf<String?>("My List", "Mumbai", "Chennai", "Kolkata", "Bengaluru")
    }
}