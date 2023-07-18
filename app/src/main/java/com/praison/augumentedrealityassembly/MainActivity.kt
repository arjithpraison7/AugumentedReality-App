package com.praison.augumentedrealityassembly
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity
import com.praison.augumentedrealityassembly.ui.theme.ChecklistAdapter

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE // Set activity orientation to landscape
        setContentView(R.layout.activity_main)

        val checklistItems = arrayOf(
            "Step 1 Keep the Brass Bearing Over the Base, Aligned to the Curvature",
            "Step 2 Place the top Cup Covering the Brass Bearing",
            "Step 3 Flip the whole body upside down",
            "Step 4 Insert 2 Nuts in the deserved place as shown",
            "Step 5 Flip the whole part upside down",
            "Step 6 Insert both the Washer",
            "Step 7 Insert and Tighten the bolt"
        )
        val adapter = ChecklistAdapter(this, checklistItems)
        val listView = findViewById<ListView>(R.id.checklist)
        listView.adapter = adapter


    }
}
