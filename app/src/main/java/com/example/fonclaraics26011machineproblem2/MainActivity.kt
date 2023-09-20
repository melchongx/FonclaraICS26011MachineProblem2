package com.example.fonclaraics26011machineproblem2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.fonclaraics26011machineproblem2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RecView = findViewById<RecyclerView>(R.id.recyclerView)
        val addEntry = findViewById<ImageButton>(R.id.btnAddEntry)
        addEntry.setOnClickListener {
            val intent = Intent(this, AddEntry::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        Log.i("info", "OnStart");
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        Log.i("info", "OnPause");
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        Log.i("info", "OnStop");
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
        Log.i("info", "OnRestart");
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        Log.i("info", "OnDestroy");
    }
}