package com.dg.diutube.screen.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dg.diutube.R
import kotlinx.android.synthetic.main.activity_main.*

interface HomeView {

}

class HomeActivity : AppCompatActivity(), HomeView {

    private val presenter: HomePresenter by lazy { HomePresenterImp(this, rvHistory) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.loadVideo()
    }
}
