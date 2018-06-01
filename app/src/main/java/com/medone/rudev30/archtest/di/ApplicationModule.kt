package com.medone.rudev30.archtest.di

import android.app.Application
import android.arch.persistence.room.Room
import com.medone.rudev30.archtest.database.gateways.GatewaysModule
import com.medone.rudev30.archtest.database.room.InformationDatabase
import com.medone.rudev30.archtest.database.room.RoomModule
import com.medone.rudev30.archtest.interactors.InteractorsModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Orlov Denis on 01.06.2018.
 * ru.dev30@kgk-global.com
 */
@Module(includes = [ViewModelModule::class, InteractorsModule::class, GatewaysModule::class, RoomModule::class])
class ApplicationModule {

}