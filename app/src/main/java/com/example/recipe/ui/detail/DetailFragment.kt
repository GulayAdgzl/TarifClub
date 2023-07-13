package com.example.recipe.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.recipe.R
import com.example.recipe.databinding.FragmentDetailBinding
import com.example.recipe.di.factory.DetailViewModelFactory

class DetailFragment : Fragment() {

    private lateinit var binding:FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner=this


        //
        val selectedFood=DetailFragmentArgs.fromBundle(requireArguments()).selectedFood
        val viewModelFactory=DetailViewModelFactory(selectedFood,requireActivity().application)

        ///
        binding.viewModel=ViewModelProvider(this,viewModelFactory)[DetailViewModel::class.java]


    }
}