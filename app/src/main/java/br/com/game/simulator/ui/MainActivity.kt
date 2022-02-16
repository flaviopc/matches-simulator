package br.com.game.simulator.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.game.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupMatchesList()
        setupMatchesRefresh()
        setupFab()
    }

    private fun setupFab() {
        TODO("Not yet implemented")
    }

    private fun setupMatchesRefresh() {
        TODO("Not yet implemented")
    }

    private fun setupMatchesList() {
        TODO("Not yet implemented")
    }
}