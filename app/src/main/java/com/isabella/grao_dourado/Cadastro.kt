package com.isabella.grao_dourado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.Fragment

class Cadastro : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cadastro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val submitButton: Button = view.findViewById(R.id.button_submit)
        submitButton.setOnClickListener {
            val nome = view.findViewById<EditText>(R.id.editTextNome).text.toString()
            val email = view.findViewById<EditText>(R.id.editTextEmail).text.toString()
            val telefone = view.findViewById<EditText>(R.id.editTextTelefone).text.toString()
            val categoria = view.findViewById<Spinner>(R.id.spinner_categoria).selectedItem.toString()
            val observacao = view.findViewById<EditText>(R.id.editTextObservacao).text.toString()


            val bundle = Bundle().apply {
                putString("nome", nome)
                putString("email", email)
                putString("telefone", telefone)
                putString("categoria", categoria)
                putString("observacao", observacao)
            }

            val listFragment = ListFragment().apply {
                arguments = bundle
            }

            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, listFragment)
                ?.addToBackStack(null)
                ?.commit()
        }
    }
}
