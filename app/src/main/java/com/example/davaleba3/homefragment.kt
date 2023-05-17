package com.example.davaleba3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [homefragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class homefragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homefragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageButton :ImageButton = view.findViewById(R.id.imageButton)
        val editText :EditText = view.findViewById(R.id.GPA)
        val bundle = Bundle ()

        imageButton.setOnClickListener{
            val name = editText.text
            val hello = "Hi, $name"

            bundle.putString("Myarg",hello)
            findNavController().navigate(R.id.profileFragment, bundle)
        }
    }


}