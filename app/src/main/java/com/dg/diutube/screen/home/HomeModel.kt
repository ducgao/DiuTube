package com.dg.diutube.screen.home

import com.dg.diutube.adapter.VideoItem

interface HomeModel {
    fun getHistoryVideo(callback: (Array<VideoItem>) -> Unit)
}


class HomeModelImp(presenter: HomePresenter) : HomeModel {
    override fun getHistoryVideo(callback: (Array<VideoItem>) -> Unit) {
        callback.invoke(
            arrayOf(
                VideoItem(
                    thumbnail = "https://giaitri.vn/wp-content/uploads/2020/01/C%C3%B4-%C4%91%C6%A1n-kh%C3%B4ng-mu%E1%BB%91n-v%E1%BB%81-nh%C3%A0.jpg",
                    title = "Cô Đơn Không Muốn Về Nhà"
                ),
                VideoItem(
                    thumbnail = "https://image.thanhnien.vn/980/uploaded/phunggiao/2019_03_17/thien-nu-mobile-3_mawc.png",
                    title = "Một Bước Yêu, Vạn Dặm Đau"
                ),
                VideoItem(
                    thumbnail = "https://i.ytimg.com/vi/4h3zOonOm_I/maxresdefault.jpg",
                    title = "Gương Mặt Lạ Lẫm"
                ),
                VideoItem(
                    thumbnail = "https://i.ytimg.com/vi/5-n0-vuK7UE/maxresdefault.jpg",
                    title = "Tìm Được Nhau Khó Thế Nào"
                ),
                VideoItem(
                    thumbnail = "https://thienphucmusic.vn/wp-content/uploads/2016/07/duoi-nhung-con-mua.jpg",
                    title = "Dưới Những Cơn Mưa"
                ),
                VideoItem(
                    thumbnail = "https://live.staticflickr.com/2902/33456590175_1b8d154632_b.jpg",
                    title = "Phải Chi Lúc Trước Anh Sai"
                )
            )
        )
    }
}