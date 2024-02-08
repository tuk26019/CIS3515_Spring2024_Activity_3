package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _text: Array<Int>) : BaseAdapter() {
    private val context = _context
    private val text = _text
    override fun getCount(): Int {
        return text.size
    }

    override fun getItem(position: Int): Any {
        return text[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.text = text[position].toString()
        textView.textSize =text[position].toFloat()
        textView.setPadding(5,10,0,10)
        return textView
    }

}