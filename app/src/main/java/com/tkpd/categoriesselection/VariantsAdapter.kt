package com.tkpd.categoriesselection

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tkpd.categoriesselection.data.datamodel.PizzaData

class VariantsAdapter(context: Context, data: PizzaData?) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return super.createViewHolder(parent, viewType)
    }

    override fun getItemCount(): Int = 0

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }

}
