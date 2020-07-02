package com.example.sqlitereglogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val trueLogin = "maks"
    val trueName = "Vasya"
    val truepassword = "12345678"
    val trueEmail ="ofof"
    val truePhone = "3456"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val login = findViewById<EditText>(R.id.login)
        val  name = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.password)
        val email = findViewById<EditText>(R.id.email)
        val phone = findViewById<EditText>(R.id.phone)
        val buttonEnter = findViewById<Button>(R.id.mak)



        buttonEnter.setOnClickListener {
            val loginText = login.text.toString()
            val nameText = name.text.toString()
            val passText = password.text.toString()
            val emailText = email.text.toString()
            val phoneText = phone.text.toString()

            if (loginText == trueLogin && nameText == trueName && passText == truepassword && emailText == trueEmail && phoneText == truePhone  ) {
                Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_LONG ).show()



                }
            else {
                Toast.makeText(applicationContext, "data is not correct", Toast.LENGTH_LONG ).show()

            }


        }


    }
}