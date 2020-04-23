package lln.sdk.grid.complex

import android.graphics.Rect
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class GridItemDecoration: RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        val right = 0
        val left = 1

        val layoutPosition = parent.getChildLayoutPosition(view)
        val layoutManager = parent.layoutManager as GridLayoutManager
        val spanCount = layoutManager.spanCount

        val viewSize = view.layoutParams as MarginLayoutParams

        val rightMargin = viewSize.rightMargin
        val leftMargin = viewSize.leftMargin
        val topMargin = viewSize.topMargin
        val bottomMargin = viewSize.bottomMargin

        when (layoutPosition % spanCount) {
            right -> {
                viewSize.setMargins(0, topMargin, rightMargin, bottomMargin)
            }
            left -> {
                viewSize.setMargins(leftMargin, topMargin, 0, bottomMargin)

            }
        }
    }
}