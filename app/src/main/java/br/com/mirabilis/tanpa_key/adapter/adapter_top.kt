package br.com.mirabilis.tanpa_key.adapter



import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.mirabilis.tanpa_key.R
import br.com.mirabilis.tanpa_key.model.mTop

class adapter_top(val Datane: ArrayList<mTop>): RecyclerView.Adapter<adapter_top.ViewHolder>() {


    @SuppressLint("WrongConstant")
    override fun onBindViewHolder(holder: adapter_top.ViewHolder, position: Int) {

        holder.tvHeader?.text = Datane[position].kategori

        holder.rvList?.layoutManager = LinearLayoutManager(holder.rvList.context, LinearLayout.VERTICAL, false)
        //var adapterSub = adapter_sub(arrayListOf(Datane[position].sub))

        var adapterSub = adapter_sub(Datane[position].sub)
        holder.rvList?.adapter = adapterSub
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter_top.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.layout_top, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return Datane.count()
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvHeader = itemView.findViewById<TextView>(R.id.tvHeader)
        val rvList = itemView.findViewById<RecyclerView>(R.id.rvItem)
    }
}
