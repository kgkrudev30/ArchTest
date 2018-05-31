package com.medone.rudev30.archtest.database.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by Orlov Denis on 31.05.2018.
 * ru.dev30@kgk-global.com
 */
@Database(entities = [(Information::class)], version = 1)
abstract class InformationDatabase : RoomDatabase(){

    abstract fun informationDao(): InformationDao

}