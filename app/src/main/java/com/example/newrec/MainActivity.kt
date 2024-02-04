package com.example.newrec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.graphics.toColorInt
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newrec.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val layoutManager = LinearLayoutManager(this)
        binding.rec.layoutManager = layoutManager


        val data = listOf(
            Mydata("10",R.drawable.ic_launcher_background),
            Mydata("30",R.drawable.ic_launcher_foreground),
            Mydata("40",R.drawable.ic_launcher_background),
            Mydata("50",R.drawable.ic_launcher_foreground)

        )

        val adapter = MyAdapter(data){item->
            val mas = item.text.toInt()
            if (mas>20){
                Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show()
            }
        }
        binding.rec.adapter = adapter
    }
}