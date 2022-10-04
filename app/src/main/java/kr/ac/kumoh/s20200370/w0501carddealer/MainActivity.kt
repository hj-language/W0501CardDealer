package kr.ac.kumoh.s20200370.w0501carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.s20200370.w0501carddealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getCardName(29)
        binding.card1.setImageResource(R.drawable.c_10_of_spades)
    }

    private fun getCardName(c: Int) : String {  // c는 0~51 까지의 숫자
        val shape = when (c / 13) {
            0 -> "spades"
            1 -> "diamonds"
            2 -> "hearts"
            3 -> "clubs"
            else -> "error"
        }
        val number = when (c % 13) {
            0 -> "ace"
            in 1..9 -> (c % 13 + 1).toString()
            10 -> "jack"
            11 -> "queen"
            12 -> "king"
            else -> "error"
        }
//        return "c_${number}_of_${shape}"
        return "c_ace_of_spades"
    }
}