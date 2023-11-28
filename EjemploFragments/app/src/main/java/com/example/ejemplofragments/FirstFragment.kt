package com.example.ejemplofragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FirstFragment : Fragment() {

    private var name: String? = null
    private var direccion: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME_BUNDLE)
            direccion = it.getString(DIRECCION_BUNDLE)
            Log.i("GURDIEL",name.orEmpty())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object {
         const val NAME_BUNDLE = "name_bundle"
         const val DIRECCION_BUNDLE = "direccion_bundle"
        @JvmStatic
        fun newInstance(name: String, direccion: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(NAME_BUNDLE, name)
                    putString(DIRECCION_BUNDLE, direccion)
                }
            }
    }
}