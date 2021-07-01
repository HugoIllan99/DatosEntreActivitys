package com.example.datosentreactivitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    lateinit var  tvNombre:TextView
    lateinit var  tvApellido:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        tvNombre = findViewById(R.id.tvNombre)
        tvApellido = findViewById(R.id.tvApellido)

        val extras = intent.extras

        val apellido = extras!!.getString("lastname")
        val nombre = extras.getString("name")

        tvNombre.text = nombre
        tvApellido.text = apellido

        Log.d("segunda","Segunda activity")
    }
}