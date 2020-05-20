package com.dg.diutube.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.dg.diutube.R

class VideoView : ConstraintLayout {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    private val thumbnail: ImageView by lazy { findViewById<ImageView>(R.id.ivThumbnail) }
    private val title: TextView by lazy { findViewById<TextView>(R.id.tvTitle) }

    init {
        LayoutInflater.from(context).inflate(R.layout.video_view, this, true)
    }

    fun setThumbnailUrl(url: String) {
        Glide.with(this).load(url).into(thumbnail)
    }

    fun setTitle(content: String) {
        title.text = content
    }
}