package com.example.zaetsdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zaetsdialog.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val bottomSheet = BottomSheetBehavior.from(binding.bottomSheetInclude.bottomSheet)
        bottomSheet.state = BottomSheetBehavior.STATE_HIDDEN

        setupListener()
        setContentView(binding.root)
    }

    private fun setupListener() {
        binding.btnXML.setOnClickListener {
            showBottomSheetXML()
        }
        binding.btnBottomSheetFragment.setOnClickListener {
            showBottomSheetDialogFragment()
        }
        binding.btnDialogFragment.setOnClickListener {
            showDialogFragment()
        }
        binding.btnAlertDialog.setOnClickListener {
            showAlertDialog()
        }
    }

    private fun showAlertDialog() {

    }

    private fun showBottomSheetXML() {
        val bottomSheet = BottomSheetBehavior.from(binding.bottomSheetInclude.bottomSheet)
        bottomSheet.state = BottomSheetBehavior.STATE_COLLAPSED
    }

    private fun showBottomSheetDialogFragment() {

    }

    private fun showDialogFragment() {
        supportFragmentManager.beginTransaction()
            .add(MyDialogFragment(), "TAG")
            .commitAllowingStateLoss()
    }
}