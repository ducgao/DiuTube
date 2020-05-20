package com.dg.diutube.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dg.diutube.R
import com.dg.diutube.view.VideoView


data class VideoItem(
    val thumbnail: String,
    val title: String
)

class VideoAdapter : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    class VideoViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val videoView: VideoView by lazy { view.findViewById<VideoView>(R.id.vvVideo) }

        fun setData(videoItem: VideoItem) {
            videoView.setThumbnailUrl(videoItem.thumbnail)
            videoView.setTitle(videoItem.title)
        }
    }

    private val data: MutableList<VideoItem> = mutableListOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VideoViewHolder {
        val videoView = LayoutInflater.from(parent.context)
            .inflate(R.layout.video_item, parent, false)

        return VideoViewHolder(videoView)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.setData(data[position])
    }

    override fun getItemCount() = data.size

    fun updateData(newData: Array<VideoItem>) {
        data.clear()
        data.addAll(newData)

        notifyDataSetChanged()
    }
}