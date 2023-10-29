package com.murilochag.domasshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.murilochag.domasshop.adapter.CustomAdapter
import com.murilochag.domasshop.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lista_produto_activity = findViewById<RecyclerView>(R.id.lista_produto_recyclerview)

        var produtos: MutableList<Produto> = mutableListOf()
        produtos.add(Produto("prod1", "descricao", 20.0))

        lista_produto_activity.adapter = CustomAdapter(this,produtos)
        lista_produto_activity.layoutManager = LinearLayoutManager(this)

    }
}