package com.example.pratica4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val botao = findViewById<Button>(R.id.Entbutton)
        botao.setOnClickListener{
            val intentActivity = Intent(this, ListaActivity::class.java)
            startActivity(intentActivity)
        }
        val botaox = findViewById<Button>(R.id.btnButton)
        botaox.setOnClickListener{
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}