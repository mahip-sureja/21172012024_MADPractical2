package com.example.a21172012024_madpractical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity"
    private lateinit var mycl:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.mycl)
        Log.i(TAG,"oncreate function called")
        Toast.makeText(this,"oncreate:function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"oncreate function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        Log.i(TAG,"onstart function called")
        Toast.makeText(this,"onstart:function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onstart function called",Snackbar.LENGTH_LONG).show()
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart function called")
        Toast.makeText(this,"onRestart:function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onRestart function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        Log.i(TAG,"onResume function called")
        Toast.makeText(this,"onResume:function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onResume function called",Snackbar.LENGTH_LONG).show()
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG,"onPause function called")
        Toast.makeText(this,"onPause:function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onPause function called",Snackbar.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG,"onStop function called")
        Toast.makeText(this,"onStop:function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onStop function called",Snackbar.LENGTH_LONG).show()
        super.onStop()
    }

    override fun onDestroy() {
        Log.i(TAG,"onDestroy function called")
        Toast.makeText(this,"onDestroy:function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onDestroy function called",Snackbar.LENGTH_LONG).show()
        super.onDestroy()
    }
}