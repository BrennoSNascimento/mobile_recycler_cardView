package com.example.recycler_cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//Agora é hora de conectar todas as peças, portanto, em nossa Activity, devemos criar uma instância do NewsAdapter e defini-la como RecyclerView.adapter.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rclNews = findViewById<RecyclerView>(R.id.rclNews)
        val adapter = NewsAdapter(createRecyclerViewItems())
        rclNews.layoutManager = LinearLayoutManager(this)
        rclNews.adapter = adapter
    }

    //Criando a lista de modelos

    private fun createRecyclerViewItems(): List<Model> {

        return mutableListOf<Model>().apply {
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img1)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img2)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img4)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img1)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img5)!!, getString(R.string.text)))
            add(TypeBModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img3)!!))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img1)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img5)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img4)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img3)!!, getString(R.string.text)))
            add(TypeBModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img5)!!))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img2)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img1)!!, getString(R.string.text)))
            add(TypeAModel(ContextCompat.getDrawable(this@MainActivity, R.drawable.img3)!!, getString(R.string.text)))
        }

    }




}