package br.com.game.simulator.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.game.simulator.databinding.ActivityDetailBinding
import br.com.game.simulator.domain.Match
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    object Extras {
        const val MATCH = "EXTRA_MATCH"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loadMatchFromExtra()
    }

    private fun loadMatchFromExtra() {
        intent?.extras?.getParcelable<Match>(Extras.MATCH)?.let { match ->
            Glide.with(this).load(match.place.image).into(binding.ivPlace)
            supportActionBar?.title = match.place.name

            binding.tvDescription.text = match.description

            Glide.with(this).load(match.homeTeam.image).into(binding.ivHomeTeam)
            binding.tvHomeTeamName.text = match.homeTeam.name
            binding.rbHomeTeamStars.rating = match.homeTeam.stars.toFloat()
            if (match.homeTeam.score != null)
                binding.tvHomeTeamScore.text = match.homeTeam.score.toString()

            Glide.with(this).load(match.awayTeam.image).into(binding.ivAwayTeam)
            binding.tvAwayTeamName.text = match.awayTeam.name
            binding.rbAwayTeamStars.rating = match.awayTeam.stars.toFloat()
            if (match.awayTeam.score != null)
                binding.tvAwayTeamScore.text = match.awayTeam.score.toString()
        }
    }
}