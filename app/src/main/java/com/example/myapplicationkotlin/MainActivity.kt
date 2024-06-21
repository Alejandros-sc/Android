package com.example.myapplicationkotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationkotlin.R.*
import com.example.myapplicationkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recicler.adapter = MovieAdapter(
            listOf(
                Movie("Title 1","https://loremflickr.com/320/240?lock=1"),
                Movie("Title 2","https://loremflickr.com/320/240?lock=2"),
                Movie("Title 3","https://loremflickr.com/320/240?lock=3"),
                Movie("Title 4","https://loremflickr.com/320/240?lock=4"),
                Movie("Title 5","https://loremflickr.com/320/240?lock=5"),
                Movie("Title 6","https://loremflickr.com/320/240?lock=6"),
                Movie("Title 7","https://loremflickr.com/320/240?lock=7"),
                Movie("Title 8","https://loremflickr.com/320/240?lock=8")

            )

        ) {
            Toast
                .makeText(this@MainActivity, it.title, Toast.LENGTH_SHORT)
                .show()
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("MainActivity", "onDestroy")
    }

}

