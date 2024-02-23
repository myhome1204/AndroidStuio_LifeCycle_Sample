package com.example.activitylifecyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activitylifecyclesample.databinding.ActivityMain2Binding
import com.example.activitylifecyclesample.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.move.setOnClickListener {
            startActivity(Intent(this@MainActivity2,MainActivity::class.java))
        }
        Log.d("testt","Activity2 : onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("testt","Activity2 : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("testt","Activity2 : onResume")
    }

    override fun onPause() {

        super.onPause()
        Log.d("testt","Activity2 : onPause")
    }

    override fun onStop() {

        super.onStop()
        Log.d("testt","Activity2 : onStop")
    }

    override fun onDestroy() {
        Log.d("testt","Activity2 : onDestroy")
        super.onDestroy()


    }

}