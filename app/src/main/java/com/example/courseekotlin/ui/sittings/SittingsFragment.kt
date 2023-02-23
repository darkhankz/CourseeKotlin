package com.example.courseekotlin.ui.sittings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.courseekotlin.databinding.FragmentSittingsBinding

class SittingsFragment : Fragment() {
    private var _binding: FragmentSittingsBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSittingsBinding.inflate(inflater, container, false)
        val view = mBinding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}