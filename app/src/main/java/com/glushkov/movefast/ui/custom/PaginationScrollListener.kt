package com.glushkov.movefast.ui.custom

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Class that implements pagination
 */
abstract class PaginationScrollListener : RecyclerView.OnScrollListener() {
    private var currentPage = 1
    private var layoutManager: LinearLayoutManager? = null
    //Flag that stops from multiple requests of new data
    private var isLoading: Boolean = false

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
        val visibleItemCount: Int = layoutManager!!.childCount
        val totalItemCount: Int = layoutManager!!.itemCount
        val firstVisibleItemPosition = layoutManager!!.findFirstVisibleItemPosition()

        if (!isLoading) {
            if (visibleItemCount + firstVisibleItemPosition >= totalItemCount && firstVisibleItemPosition >= 0) {
                setLoading(true)
                onLoadMore(currentPage)
            }
        }
    }

    /**
     * Function that is fired when bottom is reached
     * @param currentPage represents page index reached
     */
    protected abstract fun onLoadMore(currentPage: Int)

    fun addLayoutManager(layoutManager: LinearLayoutManager?) {
        this.layoutManager = layoutManager
    }

    open fun setLoading(loading: Boolean) {
        isLoading = loading
    }

    fun reset() {
        currentPage = 1
        isLoading = false
    }

    fun increasePage() {
        setLoading(false)
        currentPage += 1
    }
}