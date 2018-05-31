package com.medone.rudev30.archtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.medone.rudev30.archtest.ui.detail.DetailFragment

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, DetailFragment.newInstance())
                    .commitNow()
        }
    }

}
