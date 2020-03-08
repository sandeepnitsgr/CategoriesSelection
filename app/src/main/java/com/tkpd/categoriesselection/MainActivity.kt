package com.tkpd.categoriesselection

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tkpd.categoriesselection.data.datamodel.PizzaData
import com.tkpd.categoriesselection.viewmodel.VariantViewModel


class MainActivity : AppCompatActivity(){

    lateinit var viewModel: VariantViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(VariantViewModel::class.java)
        viewModel.getData().observe(this, Observer {data ->
            setData(data)
        })

    }

    private fun setData(data: PizzaData?) {
        val recyclerView: RecyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = VariantsAdapter(this, data)
        recyclerView.adapter = adapter

    }
}
