package com.rootcode.assesment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.rootcode.assesment3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var id:EditText
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var phone: EditText
    private lateinit var saveBtn : Button

    private lateinit var Rid:TextView
    private lateinit var Rname:TextView
    private lateinit var Remail:TextView
    private lateinit var Rphone:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        id = findViewById(R.id.idEtxt)
        name = findViewById(R.id.nameEtxt)
        email = findViewById(R.id.emailEtxt)
        phone = findViewById(R.id.phoneEtxt)

        saveBtn.setOnClickListener {

            var ID:String = id.getText().toString()
            var NAME:String = name.getText().toString()
            var EMAIL:String = email.getText().toString()
            var Phone:String = phone.getText().toString()


            var intent = Intent(this@MainActivity,MainActivity::class.java)
            intent.putExtra("id","ID")
            intent.putExtra("name","NAME")
            intent.putExtra("email","EMAIL")
            intent.putExtra("phone","Phone")

            startActivity(intent)

            val name = intent.getStringExtra("id")
            val id = intent.getStringExtra("namw")


        }

    }
}