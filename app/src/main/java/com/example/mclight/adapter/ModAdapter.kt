package com.example.mclight.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mclight.R
import com.example.mclight.soba.Modovi

class ModAdapter():
    RecyclerView.Adapter<ModAdapter.ViewHolder>() {

        val map = Modovi.mod()
        val lista:ArrayList<String> = ArrayList<String>(map.values)



        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView

            init {
                // Define click listener for the ViewHolder's View.
                textView = view.findViewById(R.id.imeModa)
                Log.d("lista","123")

            }
        }

        // Create new views (invoked by the layout manager)
        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            // Create a new view, which defines the UI of the list item
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.mod_row, viewGroup, false)



            return ViewHolder(view)
        }

        // Replace the contents of a view (invoked by the layout manager)
        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element
            viewHolder.textView.text = lista.get(position)
        }

        // Return the size of your dataset (invoked by the layout manager)
        override fun getItemCount() = lista.size



}