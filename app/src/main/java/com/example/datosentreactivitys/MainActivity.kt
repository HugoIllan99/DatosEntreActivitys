package com.example.datosentreactivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var textInputNombre:TextInputLayout
    lateinit var editTextApellido:EditText
    lateinit var btnEnviar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputNombre = findViewById(R.id.TILNombre)
        editTextApellido = findViewById(R.id.etApellido)
        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val apellido = editTextApellido.text.toString()
            val nombre = textInputNombre.editText!!.text.toString()

            val i = Intent(this,SegundaActivity::class.java)

            i.putExtra("nombre",nombre)
            i.putExtra("lastname",apellido)
            startActivity(i)
        }
    }
}