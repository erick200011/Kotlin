package com.example.ejemplo3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var et1: EditText? = null
    private var et2: EditText? = null
    private var tv3: TextView? = null
    private var checkBox1: CheckBox? = null
    private var checkBox2: CheckBox? = null
    @SuppressLint("MissingInflatedId")
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById(R.id.et1) as EditText?
        et2 = findViewById(R.id.et2) as EditText?
        tv3 = findViewById(R.id.tv3) as TextView?
        checkBox1 = findViewById(R.id.checkBox) as CheckBox?
        checkBox2 = findViewById(R.id.checkBox2) as CheckBox?
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

    fun operar(view: View?) {
        val valor1 = et1!!.text.toString()
        val valor2 = et2!!.text.toString()
        val nro1 = valor1.toInt()
        val nro2 = valor2.toInt()
        var resu = ""
        if (checkBox1!!.isChecked == true) {
            val suma = nro1 + nro2
            resu = "La suma es: $suma"
        }
        if (checkBox2!!.isChecked == true) {
            val resta = nro1 - nro2
            resu = "$resu La resta es: $resta"
        }
        tv3!!.text = resu
    }
}