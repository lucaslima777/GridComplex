package lln.sdk.grid.complex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Array(8) { i -> i.toString() }

        viewManager = GridLayoutManager(this, 2)
        viewAdapter = GridAdapter(data)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerview_grid).apply {
            layoutManager = viewManager
            addItemDecoration(GridItemDecoration())
            adapter = viewAdapter
        }
    }
}
