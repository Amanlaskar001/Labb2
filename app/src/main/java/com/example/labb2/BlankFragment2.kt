package com.example.labb2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class BlankFragment2 : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_blank2, container, false)
        //val view2 = inflater.inflate(R.layout.fragment_blank, container, false)


        view.findViewById<Button>(R.id.button2).setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment2_to_blankFragment)




        }
        view.findViewById<Button>(R.id.button3).setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_blankFragment2_to_blankFragment3)
        }
        return view
    }

}

