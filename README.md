Campsite Commander App

 Overview

Campsite Commander is a simple Android app built in Kotlin that helps users manage and organize camping gear and supplies. The app allows users to view a checklist of items needed for outdoor adventures.



🎯 Features

Displays total number of packed items using loops
Uses parallel arrays to store:
Item names
Categories
Quantities
Notes/comments
Shows a detailed list of camping gear
Navigation between main screen and detailed view (single activity design)
Simple and clean user interface


🧠 Concepts Used

Kotlin programming
Arrays (parallel arrays)
Loops (for calculations and display)
Android UI design (XML layouts)
Screen navigation (visibility switching in one activity)


📂 Project Structure

MainActivity.kt → Handles main screen logic and navigation
activity_main.xml → Contains main and detail layouts
Uses one activity with multiple layouts for simplicity


Pseudocode

Start

Create array items = ["Tent", "Sleeping Bag", "Stove"]
Create array categories = ["Shelter", "Bedding", "Cooking"]
Create array quantities = [1, 2, 1]
Create array notes = ["2-person tent", "Warm rated", "Gas stove"]

Set totalItems = 0

For each quantity in quantities array:
    Add quantity to totalItems

Display totalItems on main screen

Show Main Screen

Display button: "Add Gear"
Display button: "View List"
Display totalItems

When "View List" button is clicked:

Show Detailed Screen

For i from 0 to length of items:
    Display:
        Item name: items[i]
        Category: categories[i]
        Quantity: quantities[i]
        Notes: notes[i]

When "Back" button is clicked:
    Return to Main Screen

When "Add Gear" button is clicked:
    Display message "Feature coming soon"

START

Initialize parallel arrays for items, categories, quantities, and notes

Calculate total items using a loop

Display Main Screen:
    Show total items
    Show buttons (Add Gear, View List)

If View List clicked:
    Show all item details using loop

If Back clicked:
    Return to Main Screen

END
