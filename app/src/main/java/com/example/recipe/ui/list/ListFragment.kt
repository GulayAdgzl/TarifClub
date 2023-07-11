package com.example.recipe.ui.list

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.recipe.R
import com.example.recipe.databinding.FragmentListBinding
import com.example.recipe.di.FoodAdapter

class ListFragment : Fragment() {
    //first binding name
    private lateinit var binding: FragmentListBinding

    private val viewModel:ListViewModel by lazy{ ListViewModel()}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentListBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //View işlemleri burada gerçekleşir
        //databinding ile XML i burdaki fonks. çalıştıkça bağlayacak
        binding.lifecycleOwner=this

        binding.viewModel=viewModel

        binding.rvFood.adapter=FoodAdapter()
    }
    //list_menu için yazdıklarımız
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.list_menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}