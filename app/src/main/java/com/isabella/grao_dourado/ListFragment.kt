package com.isabella.grao_dourado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ListFragment : Fragment() {

    private lateinit var textViewNome: TextView
    private lateinit var textViewEmail: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)


        textViewNome = view.findViewById(R.id.textViewNome)
        textViewEmail = view.findViewById(R.id.textViewEmail)

        return view
    }
}

