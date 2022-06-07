package com.muchori.joseph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.muchori.joseph.databinding.FragmentPackageDetailsBinding
import kotlinx.android.synthetic.main.layout_bottom_sheet.*


class PackageDetailsFragment : Fragment() {

  private var _binding: FragmentPackageDetailsBinding? = null
  private val  binding get () = _binding!!

  private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {

    _binding = FragmentPackageDetailsBinding.inflate(inflater, container, false)

    /**bottomSheetBehavior = BottomSheetBehavior.from(layout_bottom_sheet)

    bottomSheetBehavior.addBottomSheetCallback(object :
      BottomSheetBehavior.BottomSheetCallback() {

      override fun onSlide(bottomSheet: View, slideOffset: Float) {
        // handle onSlide
      }

      override fun onStateChanged(bottomSheet: View, newState: Int) {
        when (newState) {
          BottomSheetBehavior.STATE_COLLAPSED -> Toast.makeText(
            requireActivity(),
            "STATE_COLLAPSED",
            Toast.LENGTH_SHORT
          ).show()
          BottomSheetBehavior.STATE_EXPANDED -> Toast.makeText(
            requireActivity(),
            "STATE_EXPANDED",
            Toast.LENGTH_SHORT
          ).show()
          BottomSheetBehavior.STATE_DRAGGING -> Toast.makeText(
            requireActivity(),
            "STATE_DRAGGING",
            Toast.LENGTH_SHORT
          ).show()
          BottomSheetBehavior.STATE_SETTLING -> Toast.makeText(
            requireActivity(),
            "STATE_SETTLING",
            Toast.LENGTH_SHORT
          ).show()
          BottomSheetBehavior.STATE_HIDDEN -> Toast.makeText(
            requireActivity(),
            "STATE_HIDDEN",
            Toast.LENGTH_SHORT
          ).show()
          else -> Toast.makeText(requireActivity(), "OTHER_STATE", Toast.LENGTH_SHORT)
            .show()
        }
      }
    })*/

    return binding.root
  }

}