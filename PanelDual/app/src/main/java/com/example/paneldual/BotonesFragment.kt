package com.example.paneldual

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.paneldual.databinding.FragmentBotonesBinding


class BotonesFragment : Fragment() {

    private var _binding: FragmentBotonesBinding? = null
    private val binding get() = _binding!!
    private lateinit var botonesListener: BotonesListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_botones, container, false)
        _binding = FragmentBotonesBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRojo.setOnClickListener {
            botonesListener.onClickButton(Color.RED)
        }
        binding.btnAzul.setOnClickListener { botonesListener.onClickButton(Color.GREEN) }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(activity is BotonesListener){
            botonesListener = activity as BotonesListener
        } else{
            throw RuntimeException("Must implement StarSignListener")
        }
        //Valdría también lo siguiente
    //        if(activity is StarSignListener){
    //            starSignListener = activity as StarSignListener
    //        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }





}