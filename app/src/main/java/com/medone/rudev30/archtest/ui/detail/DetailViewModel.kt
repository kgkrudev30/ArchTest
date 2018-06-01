package com.medone.rudev30.archtest.ui.detail

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.medone.rudev30.archtest.interactors.detaildata.GetDetailDataPresentationContract
import javax.inject.Inject

class DetailViewModel @Inject constructor(
        private val getDetailInteractor: GetDetailDataPresentationContract.Interactor
    ) : ViewModel(), DetailViewContract.ViewModel {

    override var welcomeString: MutableLiveData<String> = MutableLiveData()

    init {
        getData()
    }

    private fun getData(){
        getDetailInteractor.detailString.subscribe({welcomeString.postValue(it)})
    }
}
