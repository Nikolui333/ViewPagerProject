package com.example.viewpagerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagerproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}