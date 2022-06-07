package com.muchori.joseph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.muchori.joseph.databinding.FragmentDetailBinding
import com.muchori.joseph.databinding.FragmentHomeBinding


class DetailFragment : BottomSheetDialogFragment() {

  private var _binding: FragmentDetailBinding? = null
  private val binding get() = _binding!!


  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {

    _binding = FragmentDetailBinding.inflate(inflater, container, false)

    return binding.root
  }
}