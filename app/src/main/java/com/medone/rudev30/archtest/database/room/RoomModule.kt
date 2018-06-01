package com.medone.rudev30.archtest.database.room

import android.app.Application
import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Orlov Denis on 01.06.2018.
 * ru.dev30@kgk-global.com
 */
@Module
class RoomModule {
    @Singleton
    @Provides
    fun provideInformationDatabase(app: Application): InformationDatabase
            = Room.databaseBuilder(app, InformationDatabase::class.java, "information-database.db").build()

    @Singleton
    @Provides
    fun provideInformationDao(informationDatabase: InformationDatabase){
        informationDatabase.informationDao()
    }
}