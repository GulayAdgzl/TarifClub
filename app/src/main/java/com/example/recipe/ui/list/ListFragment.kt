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

        setHasOptionsMenu(true)
    }
    //list_menu için yazdıklarımız
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.list_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    //menu de işlem yapmak için
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.show_gry -> ""
            R.id.show_huff -> ""
            R.id.show_raven -> ""
            R.id.show_sly -> ""

        }
        return true
    }

}