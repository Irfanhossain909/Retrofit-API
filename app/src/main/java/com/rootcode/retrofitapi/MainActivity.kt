package com.rootcode.retrofitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quoteApi = RetrofitBuilder.getInstance().create(MyInterface::class.java)

        GlobalScope.launch {
            val result = quoteApi.getQuoates()
            if (result!=null){
                Log.d("Irfan", result.body().toString())
            }
        }
    }
}