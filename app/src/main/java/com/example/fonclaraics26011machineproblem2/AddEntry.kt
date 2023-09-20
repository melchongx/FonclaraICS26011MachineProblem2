package com.example.fonclaraics26011machineproblem2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.example.fonclaraics26011machineproblem2.DatabaseConnect as DatabaseConnect1

class AddEntry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_entry)

        val title = findViewById<EditText>(R.id.etTitle);
        val category = findViewById<EditText>(R.id.etCategory);
        val amount = findViewById<EditText>(R.id.etAmount);

        val SubmitEntry = findViewById<Button>(R.id.btnSubmitEntry)
        SubmitEntry.setOnClickListener {

            val myDB = DatabaseConnect1(this)
            myDB.addBook(title.text.toString().trim(), category.text.toString().trim(), amount.text.toString().trim().toDouble())



            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}