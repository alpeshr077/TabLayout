package com.alpesh.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import com.alpesh.tablayout.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabLay.addTab(binding.tabLay.newTab().setText("Chats"))
        binding.tabLay.addTab(binding.tabLay.newTab().setText("Status"))
        binding.tabLay.addTab(binding.tabLay.newTab().setText("Calls"))

    }
}