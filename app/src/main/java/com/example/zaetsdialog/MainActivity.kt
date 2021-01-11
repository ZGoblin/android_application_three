package com.example.zaetsdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.afollestad.materialdialogs.MaterialDialog
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
        binding.btnMaterialDialog.setOnClickListener {
            showMaterialDialog()
        }
    }

    private fun showMaterialDialog() {
        MaterialDialog(this).show {
            title(text = "Simple title")
            message(text = "Simple message in material dialog")
            icon(R.drawable.ic_launcher_background)
            positiveButton(text = "Okey, go back")
        }
    }

    private fun showAlertDialog() {
        AlertDialog.Builder(this)
            .setTitle("Simple title")
            .setMessage("Simple message in alert dialog")
            .setIcon(R.drawable.ic_launcher_background)
            .setPositiveButton("Okay, go back") { dialog, wich ->
                Toast.makeText(this, "", Toast.LENGTH_SHORT)
            }
            .show()
    }

    private fun showBottomSheetXML() {
        val bottomSheet = BottomSheetBehavior.from(binding.bottomSheetInclude.bottomSheet)
        bottomSheet.state = BottomSheetBehavior.STATE_COLLAPSED
    }

    private fun showBottomSheetDialogFragment() {
        supportFragmentManager.beginTransaction()
            .add(MyBottomSheetDialogFragment(), "TAG")
            .commitAllowingStateLoss()
    }

    private fun showDialogFragment() {
        supportFragmentManager.beginTransaction()
            .add(MyDialogFragment(), "TAG")
            .commitAllowingStateLoss()
    }
}