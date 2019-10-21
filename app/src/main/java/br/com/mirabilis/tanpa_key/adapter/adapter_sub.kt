package br.com.mirabilis.tanpa_key.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.mirabilis.tanpa_key.R
import br.com.mirabilis.tanpa_key.model.mSub

class adapter_sub(val Datane: ArrayList<mSub>): RecyclerView.Adapter<adapter_sub.ViewHolder>() {

    override fun onBindViewHolder(holder: adapter_sub.ViewHolder, position: Int) {
        val location = Datane[position]
        holder.tvName?.text = location.id_menu
        holder.tvHobi?.text = location.nama_menu
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter_sub.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.layout_sub, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return Datane.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.tvJenis)
        val tvHobi = itemView.findViewById<TextView>(R.id.tvWarna)
    }
}