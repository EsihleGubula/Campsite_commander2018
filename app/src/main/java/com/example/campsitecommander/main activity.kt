package com.example.onzacampsite

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // ✅ Parallel arrays (assignment requirement)
    private var items = arrayOf("Tent", "Sleeping Bag", "Stove")
    private var categories = arrayOf("Shelter", "Bedding", "Cooking")
    private var quantities = arrayOf(1, 2, 1)
    private var notes = arrayOf("2-person tent", "Warm rated", "Gas stove")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// UI elements
        val txtTotal = findViewById<TextView>(R.id.txtTotal)
        val btnAddGear = findViewById<Button>(R.id.btnAddGear)
        val btnViewList = findViewById<Button>(R.id.btnViewList)

// Loop to calculate total items
        var totalItems = 0
        for (qty in quantities) {
            totalItems += qty
        }

// Display total
        txtTotal.text = "Total Items Packed: $totalItems"

// Navigate to Detailed Screen (you will create next)
        btnViewList.setOnClickListener {
            val intent = Intent(this, DetailedActivity::class.java)
            startActivity(intent)
        }

// Add Gear button (placeholder for now)
        btnAddGear.setOnClickListener {
            txtTotal.text = "Add Gear feature coming soon"

    }

    showMain()

}



private fun showMain() {



    findViewById<View>(R.id.mainLayout).visibility = View.VISIBLE



    findViewById<View>(R.id.detailLayout).visibility = View.GONE



}



private fun showDetails() {



    findViewById<View>(R.id.mainLayout).visibility = View.GONE



    findViewById<View>(R.id.detailLayout).visibility = View.VISIBLE



}



}

