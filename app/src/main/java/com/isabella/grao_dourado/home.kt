package com.isabella.grao_dourado

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {


    private lateinit var proxima: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        proxima = findViewById(R.id.imagem1)

        proxima.setOnClickListener{
            val proximaTela = Intent(this, details::class.java)

            startActivity(proximaTela)
        }

    }
}