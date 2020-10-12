package com.example.Tarea8YesseniaMateo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sumar (view: View){
    btnsum.setOnClickListener(){}
        var n1: Int = (txnum1.text.toString()).toInt()
        var n2: Int = (txnum2.text.toString()).toInt()
        var total : String = (n1+n2).toString()
        txView.setText(total)
}
    fun multiplicar (view: View){
        btnmult.setOnClickListener(){}
        var n1: Int = (txnum1.text.toString()).toInt()
        var n2: Int = (txnum2.text.toString()).toInt()
        var total : String = (n1*n2).toString()
        txView.setText(total)
    }
    fun dividir(view: View){
btndivi.setOnClickListener(){}
        var n1: Int = (txnum1.text.toString()).toInt()
        var n2: Int = (txnum2.text.toString()).toInt()
        var total : String = (n1/n2).toString()
        txView.setText(total)
    }
    fun restar(view: View) {
btnrestarr.setOnClickListener(){}
        var n1: Int = (txnum1.text.toString()).toInt()
        var n2: Int = (txnum2.text.toString()).toInt()
        var total : String = (n1-n2).toString()
        txView.setText(total)
    }
    fun borrar (view: View){
        btnborrar.setOnClickListener(){}
        var total: String= (0).toString()
        txView.setText(total)
        txnum1.setText(total)
        txnum2.setText(total)
    }
}