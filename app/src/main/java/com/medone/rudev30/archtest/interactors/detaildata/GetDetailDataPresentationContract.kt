package com.medone.rudev30.archtest.interactors.detaildata

import io.reactivex.Flowable

/**
 * Created by Orlov Denis on 30.05.2018.
 * ru.dev30@kgk-global.com
 */
class GetDetailDataPresentationContract {
    interface Interactor{
        val detailString:Flowable<String>
    }
}