package com.medone.rudev30.archtest.interactors

import com.medone.rudev30.archtest.database.gateways.GetDetailGateway
import com.medone.rudev30.archtest.interactors.detaildata.GetDetailDataGateWayContract
import com.medone.rudev30.archtest.interactors.detaildata.GetDetailDataPresentationContract
import com.medone.rudev30.archtest.interactors.detaildata.GetDetailInteractor
import dagger.Module
import dagger.Provides

/**
 * Created by Orlov Denis on 01.06.2018.
 * ru.dev30@kgk-global.com
 */
@Module
class InteractorsModule {
    @Provides
    fun provideGetDetailDataInteractor(gateway: GetDetailDataGateWayContract.Gateway):GetDetailDataPresentationContract.Interactor
        = GetDetailInteractor(gateway)
}