package com.tkpd.categoriesselection

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.tkpd.categoriesselection.data.datamodel.PizzaData


class ContentAdapter constructor(
    context: Context?,
    data: PizzaData?
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val mData: PizzaData?
    private val mInflater: LayoutInflater
    private var mClickListener: ItemClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = mInflater.inflate(R.layout.content_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val variant = mData?.variants?.variantGroups?.get(position)

    }

    override fun getItemCount(): Int {
        return mData?.variants?.variantGroups?.size ?: 0
    }

    inner class MyViewHolder constructor(itemView: View) : ViewHolder(itemView),
        View.OnClickListener {
        override fun onClick(view: View?) {
            if (mClickListener != null) mClickListener!!.onItemClick(view, adapterPosition)
        }

        init {
            itemView.setOnClickListener(this)
        }
    }
    inner class TitleViewHolder constructor(itemView: View) : ViewHolder(itemView),
        View.OnClickListener {
        override fun onClick(view: View?) {
            if (mClickListener != null) mClickListener!!.onItemClick(view, adapterPosition)
        }

        init {
            itemView.setOnClickListener(this)
        }
    }

    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }

    init {
        mInflater = LayoutInflater.from(context)
        mData = data
    }
}