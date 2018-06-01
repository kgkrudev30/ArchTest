package com.medone.rudev30.archtest.database.gateways

import com.medone.rudev30.archtest.database.room.InformationDao
import com.medone.rudev30.archtest.interactors.detaildata.GetDetailDataGateWayContract
import dagger.Module
import dagger.Provides

/**
 * Created by Orlov Denis on 01.06.2018.
 * ru.dev30@kgk-global.com
 */
@Module
class GatewaysModule {
    @Provides
    fun provideGetDetailGateway(informationDao: InformationDao): GetDetailDataGateWayContract.Gateway
        = GetDetailGateway(informationDao)
}