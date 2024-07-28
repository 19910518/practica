package com.bbyvos.bloqueb

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.bbyvos.bloqueb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private  lateinit var binding: ActivityMainBinding
     private lateinit var  navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        iniUi()


        }

    private fun iniUi() {
        TODO("Not yet implemented")
        initNavigation()
    }

    private fun initNavigation() {
        val navHost :NavHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentcontainerView) as NavHostFragment
        navController = navHost.navController
        binding.bottomnaviView.setupWithNavController(navController)

    }



}

