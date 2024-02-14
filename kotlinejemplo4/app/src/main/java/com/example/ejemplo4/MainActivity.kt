package com.example.ejemplo4

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var et1: EditText? = null
    private var et2: EditText? = null
    @SuppressLint("MissingInflatedId")
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById(R.id.editText) as EditText?
        et2 = findViewById(R.id.editText2) as EditText?
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bottom_nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }

    fun verificar(v: View?) {
        val clave = et2!!.text.toString()
        if (clave.length == 0) {
            val notificacion: Toast =
                Toast.makeText(this, "La clave no puede quedar vac�a", Toast.LENGTH_LONG)
            notificacion.show()
        }
    }
}