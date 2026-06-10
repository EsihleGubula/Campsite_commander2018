 package com.example.campsitecommander

 import androidx.collection.arraySetOf
 import org.w3c.dom.Comment

 object GearData
 // Parallel arrays initialized with simple data
 var itemNames = arrayOf("Tent", "Marshmallow", "Flashlight")
 var categories = arrayOf("Shelter", "Food", "Safety")
 var quantities = arrayOf(1 , 3 , 2 )
 var comments = arrayOf(" 4 - person waterproof " , " For S ' mores (Mega size)","Check batteries (AA)")

 // Function to add a new item to the parallel arrays
 fun addItem(name: String, category: String , qty: Int, comment: String) {
     itemNames += name
     categories+=category
     comments+=comment
}
// Loop structure to calculate the total quantity of items packed
fun getTotalItems() : Int {
var total = 0
for (qty in quantities) {
total +=qty
}
return total
}
