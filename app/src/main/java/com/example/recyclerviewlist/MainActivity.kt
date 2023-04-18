package com.example.recyclerviewlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable (
            R.drawable.ica,
            Namamhs = "Ica",
            Nimmhs = "01010001",
            Telp = "0811"
        ),
        Inis_Variable(
            R.drawable.masbro,
            Namamhs = "KappuiBarruh",
            Nimmhs = "01010002",
            Telp = "0812"
        ),
        Inis_Variable(
            R.drawable.anjing,
            Namamhs = "Rocky",
            Nimmhs = "01010003",
            Telp = "0813"
        ),
        Inis_Variable(
            R.drawable.kucingcakar,
            Namamhs = "Meyong",
            Nimmhs = "01010004",
            Telp = "0814"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

        //ShowListMahasiswa()
        //ShowGridMahasiswa()
        ShowCardMahasiswa()
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter=Card_MahasiswaAdapter(this,Datamahasiswa){

        }
        recyclerView.adapter=adapter
    }

    private fun ShowGridMahasiswa() {
        val adapter=Grid_MahasiswaAdapter(grid_mhs = Datamahasiswa){

        }
        val recyclerView=findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
            recyclerView.layoutManager=GridLayoutManager(this,2)
            recyclerView.adapter=Grid_MahasiswaAdapter(Datamahasiswa){

            }
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=List_MahasiswaAdapter(this,Datamahasiswa){

        }
    }
}