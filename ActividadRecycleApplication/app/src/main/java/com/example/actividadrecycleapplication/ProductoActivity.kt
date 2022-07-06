package com.example.actividadrecycleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.actividadrecycleapplication.Adapter.ProductoAdapter
import com.example.actividadrecycleapplication.databinding.ActivityProductoBinding

class ProductoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycleView()
    }

    fun initRecycleView(){
        binding.rvProducto.layoutManager = LinearLayoutManager(this)
        binding.rvProducto.adapter = ProductoAdapter(ProductosProvider.productList)
    }
}