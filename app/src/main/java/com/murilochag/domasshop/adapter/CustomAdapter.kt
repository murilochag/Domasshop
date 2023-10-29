package com.murilochag.domasshop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.murilochag.domasshop.R
import com.murilochag.domasshop.model.Produto

class CustomAdapter(val context: Context, val produtos: MutableList<Produto>): RecyclerView.Adapter<CustomAdapter.ProdutoViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val view = LayoutInflater.from(this.context).inflate(R.layout.produtos_activity, parent, false)
        return ProdutoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return produtos.size
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        var produto = produtos[position]
        holder.vincula(produto)
    }

    class ProdutoViewHolder(view: View): ViewHolder(view){
       fun vincula(produto: Produto){
           itemView.findViewById<TextView>(R.id.nome_produto_activity).text = produto.nome
           itemView.findViewById<TextView>(R.id.descricao_produto_activity).text = produto.descricao
           itemView.findViewById<TextView>(R.id.valor_produto_activity).text = produto.valor.toString()
       }
    }


}