package com.praison.augumentedrealityassembly.ui.theme

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckedTextView

class ChecklistAdapter(context: Context, items: Array<String>) :
    ArrayAdapter<String>(context, 0, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = convertView ?: LayoutInflater.from(context).inflate(
            android.R.layout.simple_list_item_multiple_choice,
            parent,
            false
        )

        val itemText = itemView.findViewById<CheckedTextView>(android.R.id.text1)
        itemText.text = getItem(position)
        itemText.setOnClickListener {
            itemText.toggle()
        }

        return itemView
    }
}

