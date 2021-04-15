package com.example.recycler_cardview

import android.graphics.drawable.Drawable

sealed class Model

data class TypeAModel(val image: Drawable, val text:String) : Model()

data class TypeBModel(val image: Drawable) : Model()

//TypeAModel tem duas propriedades chamadas image e text e TypeBModel tem uma propriedade chamada image.
// Posteriormente, usamos uma lista desses modelos e suas propriedades para preencher nossos itens RecyclerView.