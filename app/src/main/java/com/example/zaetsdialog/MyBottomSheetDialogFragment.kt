package com.example.zaetsdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zaetsdialog.databinding.BottomSheetDialogFragmentBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheetDialogFragment: BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetDialogFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetDialogFragmentBinding.inflate(layoutInflater, container, false)

        binding.btnBack.setOnClickListener {
            dialog?.dismiss()
        }

        return binding.root
    }
}