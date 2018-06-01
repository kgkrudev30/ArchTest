package com.medone.rudev30.archtest.interactors.detaildata

import io.reactivex.Flowable
import com.medone.rudev30.archtest.interactors.detaildata.GetDetailDataGateWayContract.Gateway
import com.medone.rudev30.archtest.interactors.detaildata.GetDetailDataPresentationContract.Interactor
import javax.inject.Inject

/**
 * Created by Orlov Denis on 30.05.2018.
 * ru.dev30@kgk-global.com
 */
class GetDetailInteractor @Inject constructor(private val gateway: Gateway) : Interactor {
    override var detailString: Flowable<String> = gateway.startString
}