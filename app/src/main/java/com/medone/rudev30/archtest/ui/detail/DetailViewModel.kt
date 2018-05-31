package com.medone.rudev30.archtest.ui.detail

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class DetailViewModel : ViewModel(), DetailViewContract.ViewModel {

    override var welcomeString: MutableLiveData<String> = MutableLiveData()

}
