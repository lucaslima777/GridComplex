package lln.sdk.grid.complex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_grid.view.*

class GridAdapter(private val data: Array<String>) :
    RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    class GridViewHolder(cardView: CardView) : RecyclerView.ViewHolder(cardView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GridAdapter.GridViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grid, parent, false) as CardView
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.itemView.item_textview_grid.text = data[position]
    }

    override fun getItemCount() = data.size
}
