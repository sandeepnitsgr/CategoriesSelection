package com.tkpd.categoriesselection.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tkpd.categoriesselection.R

class VariantItemViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView), Visitable {
    override fun type(typeFactory: TypeFactory): Int  = R.layout.content_layout
}