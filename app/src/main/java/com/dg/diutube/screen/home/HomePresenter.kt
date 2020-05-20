package com.dg.diutube.screen.home

import androidx.recyclerview.widget.RecyclerView
import com.dg.diutube.adapter.VideoAdapter

interface HomePresenter {
    fun loadVideo()
}

class HomePresenterImp(view: HomeView, recyclerView: RecyclerView) : HomePresenter {
    private val model: HomeModel by lazy { HomeModelImp(this) }
    private val adapter: VideoAdapter = VideoAdapter()

    init {
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }

    override fun loadVideo() {
        model.getHistoryVideo {
            adapter.updateData(it)
        }
    }
}