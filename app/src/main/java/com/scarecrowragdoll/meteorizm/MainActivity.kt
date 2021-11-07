package com.scarecrowragdoll.meteorizm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.scarecrowragdoll.meteorizm.databinding.ActivityMainBinding
import com.scarecrowragdoll.meteorizm.databinding.BottomSheetBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val bottomSheet = BottomSheet()
        val bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.linearBottom))


        binding.constraintHeader.setOnClickListener {
            if (bottomSheet.isHidden) {
                bottomSheet.show(supportFragmentManager, BottomSheet.TAG)
            } else {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }

        setContentView(binding.root)
    }
}