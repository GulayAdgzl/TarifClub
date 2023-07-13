package com.example.recipe.ui.list

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.recipe.R
import com.example.recipe.databinding.FragmentListBinding
import com.example.recipe.di.FoodAdapter

class ListFragment : Fragment() {
    //first binding name
    private lateinit var binding: FragmentListBinding

    private val viewModel:ListViewModel by lazy{ ListViewModel()}

    //Detail for
    private  val foodAdapter by lazy { FoodAdapter() }

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

        //binding.rvFood.adapter=FoodAdapter()
        binding.rvFood.adapter=foodAdapter

        //for detail
        foodAdapter.onClick={
            viewModel.displayFoodDetail(it)

        }
        viewModel.navigateToSelectedFood.observe(viewLifecycleOwner){
            if(it!=null){
                this.findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(it))
                viewModel.
            }
        }

        //
        setHasOptionsMenu(true)
    }
    //list_menu için yazdıklarımız
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.list_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    //menu de işlem yapmak için
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        viewModel.filterFood(
            when(item.itemId){
                R.id.show_gry -> FoodApiFilter.SHOW_GRY
                R.id.show_huff -> FoodApiFilter.SHOW_HUFF
                R.id.show_raven -> FoodApiFilter.SHOW_RAVEN
                else ->  FoodApiFilter.SHOW_SLY

            }
        )

        return true
    }

}