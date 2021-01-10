package com.example.zaetsdialog

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.DialogFragment
import com.example.zaetsdialog.databinding.DialogFragmentBinding

class MyDialogFragment: DialogFragment() {
    private lateinit var binding: DialogFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogFragmentBinding.inflate(inflater, container, false)
        binding.btnBack.setOnClickListener {
            dialog?.dismiss()
        }

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
    }
}