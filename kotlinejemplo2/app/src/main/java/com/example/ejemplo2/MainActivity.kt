package com.example.ejemplo2


import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.ejemplo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var et1: EditText? = null
    private var et2: EditText? = null
    private var tv3: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById(R.id.et1) as EditText?
        et2 = findViewById(R.id.et2) as EditText?
        tv3 = findViewById(R.id.tv3) as TextView?
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflar el menú; esto agrega elementos al ActionBar si está presente.
        menuInflater.inflate(R.menu.bottom_nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Manejar clics en los elementos del ActionBar aquí. El ActionBar manejará automáticamente los clics en los botones Inicio/Atrás, siempre que especifiques una actividad principal en AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }

    fun sumar(view: View?) {
        val valor1 = et1!!.text.toString()
        val valor2 = et2!!.text.toString()
        val nro1 = valor1.toInt()
        val nro2 = valor2.toInt()
        val suma = nro1 + nro2
        val resu = suma.toString()
        tv3!!.text = resu
    }
}