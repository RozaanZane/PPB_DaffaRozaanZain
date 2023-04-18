package com.example.recyclerviewlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlist.Inis_Variable

class Grid_MahasiswaAdapter (
    private val grid_mhs:List<Inis_Variable>,
    val listener:(Inis_Variable)->Unit):
    RecyclerView.Adapter<Grid_MahasiswaAdapter.GridViewHolder>(){
        class GridViewHolder(view: View):RecyclerView.ViewHolder(view){
            val fotomhs=view.findViewById<ImageView>(R.id.civ_id_grid)

            private val layoutManager=GridLayoutManager(view.context,2)
            fun bindView(grid_mhs:Inis_Variable,listener: (Inis_Variable) -> Unit){
                fotomhs.setImageResource((grid_mhs.fotomhs))
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.grid_mahasiswalayout, parent, false)
        val layoutManager = GridLayoutManager(parent.context,2)
        return GridViewHolder(view)
    }

    override fun getItemCount():Int=grid_mhs.size
    override fun onBindViewHolder(holder: GridViewHolder,position:Int) {
        holder.bindView(grid_mhs[position],listener)
    }
}