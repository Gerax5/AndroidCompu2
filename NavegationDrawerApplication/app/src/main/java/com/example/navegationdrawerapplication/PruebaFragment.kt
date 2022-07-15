package com.example.navegationdrawerapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navegationdrawerapplication.databinding.FragmentPruebaBinding

class PruebaFragment : Fragment() {

    private var _binding: FragmentPruebaBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_prueba, container, false)
        _binding = FragmentPruebaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        binding.tvTextoNormal.text = "Rojo"
        super.onActivityCreated(savedInstanceState)
    }
}