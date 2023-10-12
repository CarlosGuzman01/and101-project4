package com.example.and101_project4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.SeekBar
import com.example.and101_project4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val INITIAL_PERCENTAGE: Int = 15


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // mandatory android
        binding = ActivityMainBinding.inflate(layoutInflater) //setContentView sets the content of the initial activity
        setContentView(binding.root)

        //tvPercent
        var tvPercentString: String = INITIAL_PERCENTAGE.toString() + "%"
        binding.tvPercent.setText(tvPercentString)
        binding.seekBarTip.progress = INITIAL_PERCENTAGE.toInt()



        binding.seekBarTip.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, progress: Int, p2: Boolean) {
                var percentageString: String  = progress.toString()
                binding.tvPercent.setText(percentageString + "%")



            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })






    }
}