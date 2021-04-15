package com.example.recycler_cardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Crie uma classe chamada NewsAdapter e forneça a ela um construtor que pegue uma lista de Modelos.
// Assim como layouts e modelos, para cada tipo de visualização, temos que criar um ViewHolder diferente.
// Portanto, crie duas classes aninhadas chamadas TypeAViewHolder e TypeBViewHolder.


class NewsAdapter(private val items: List<Model>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    // A função getItemViewType retorna um valor Int que indica o tipo de visualização do item em uma posição específica.
    // Nesta função, verificamos se nosso tipo de dados na posição atual é TypeAModel, então retornamos 1 e, se não, retornamos 2.
    // Mais tarde, obteremos esses valores na função onCreateViewHolder para indicar que tipo de ViewHolder precisamos Criar.


    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is TypeAModel -> 1
            is TypeBModel -> 2
        }
    }

    // Como é mostrado, na função onCreateViewHolder verificamos se o tipo de visualização é igual a 1,
    // então retornamos uma instância de TypeAViewHolder e se for igual a 2, retornamos uma instância de TypeBViewHolder.
    // Também no onBindViewHolder, determinamos o tipo do item verificando o tipo de suporte.


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 1) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.type_a_item, parent, false)
            TypeAViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.type_b_item, parent, false)
            TypeBViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is TypeAViewHolder) {
            val item = items[position] as TypeAModel
            holder.imgNews.setImageDrawable(item.image)
            holder.txtNews.text = item.text
        } else if (holder is TypeBViewHolder) {
            val item = items[position] as TypeBModel
            holder.imgBanner.setImageDrawable(item.image)
        }
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    class TypeAViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgNews = itemView.findViewById<ImageView>(R.id.imgNews)
        val txtNews = itemView.findViewById<TextView>(R.id.txtNews)
    }

    class TypeBViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBanner = itemView.findViewById<ImageView>(R.id.imgBanner)
    }

}