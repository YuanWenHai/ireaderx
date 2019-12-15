package com.will.ireaderx.ui

import android.os.Bundle
import com.will.ireaderx.R
import com.will.ireaderx.base.BaseActivity

/**
 * created  by will on 2019/12/13 15:41
 */
class HostActivity : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)
        supportFragmentManager.beginTransaction().add(R.id.activity_host_container,BookListFragment()).commit()
    }
}