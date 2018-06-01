package com.medone.rudev30.archtest.database.gateways

import com.medone.rudev30.archtest.database.room.InformationDao
import com.medone.rudev30.archtest.interactors.detaildata.GetDetailDataGateWayContract
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by Orlov Denis on 30.05.2018.
 * ru.dev30@kgk-global.com
 */
class GetDetailGateway @Inject constructor(private val informationDao: InformationDao) : GetDetailDataGateWayContract.Gateway{
    override val startString: Flowable<String> = informationDao.getInformation()
}