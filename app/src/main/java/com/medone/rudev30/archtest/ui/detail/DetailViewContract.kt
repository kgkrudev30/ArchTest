package com.medone.rudev30.archtest.ui.detail

import android.arch.lifecycle.LiveData
/**
 * Created by Orlov Denis on 29.05.2018.
 * ru.dev30@kgk-global.com
 */
class DetailViewContract {
    interface ViewModel{
        val welcomeString:LiveData<String>
    }
}