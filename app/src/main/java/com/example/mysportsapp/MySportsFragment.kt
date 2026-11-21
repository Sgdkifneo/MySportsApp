package com.example.mysportsapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MySportsFragment : Fragment(R.layout.fragment_my_sports) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnFootball).setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_footballFragment)
        }
        view.findViewById<Button>(R.id.btnBasketball).setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_basketballFragment)
        }
        view.findViewById<Button>(R.id.btnTennis).setOnClickListener {
            findNavController().navigate(R.id.action_mySportsFragment_to_tennisFragment)
        }
    }
}