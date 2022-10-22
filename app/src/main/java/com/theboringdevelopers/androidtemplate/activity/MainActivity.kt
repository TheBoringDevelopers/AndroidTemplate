package com.theboringdevelopers.androidtemplate.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.theboringdevelopers.androidtemplate.R
import com.theboringdevelopers.androidtemplate.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Базовая активность приложения
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpNavigation()
    }

    private fun setUpNavigation(){
//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        binding.navView.setupWithNavController(navController)
    }
}