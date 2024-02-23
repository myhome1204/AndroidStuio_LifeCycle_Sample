package com.example.activitylifecyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.activitylifecyclesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.move.setOnClickListener {
            startActivity(Intent(this@MainActivity,MainActivity2::class.java))
        }
        Log.d("testt","Activity1 : onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("testt","Activity1 : onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("testt","Activity1 : onRestart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("testt","Activity1 : onResume")
    }

    override fun onPause() {

        super.onPause()
        Log.d("testt","Activity1 : onPause")
    }

    override fun onStop() {

        super.onStop()
        Log.d("testt","Activity1 : onStop")
    }

    override fun onDestroy() {
        Log.d("testt","Activity1 : onDestroy")
        super.onDestroy()


    }

}