package com.start3a.flomusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.start3a.flomusic.databinding.ActivityIntroBinding
import com.start3a.flomusic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initView() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_layout, PlayMusicFragment())
            .commit()
    }
}