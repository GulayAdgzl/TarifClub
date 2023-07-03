package com.example.RecipeClub.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.RecipeClub.R
import com.example.RecipeClub.databinding.FragmentListBinding

class ListFragment : Fragment() {
    //first binding name
    private lateinit var binding:FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //View işlemleri burada gerçekleşir
        //databinding ile XML i burdaki fonks. çalıştıkça bağlayacak
        binding.lifecycleOwner=this

    }

}