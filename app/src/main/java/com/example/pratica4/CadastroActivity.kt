package com.example.pratica4


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button



class CadastroActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val botao = findViewById<Button>(R.id.BtnCadastrar)
        botao.setOnClickListener{
            val intentActivity = Intent(this, ListaActivity::class.java)
            startActivity(intentActivity)
        }
        val botaox = findViewById<Button>(R.id.btnLogin)
        botaox.setOnClickListener{
            val intentActivity = Intent(this, LoginActivity::class.java)
            startActivity(intentActivity)
        }
    }
}