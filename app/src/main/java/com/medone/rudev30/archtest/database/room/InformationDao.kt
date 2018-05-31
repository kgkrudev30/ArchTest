package com.medone.rudev30.archtest.database.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Flowable

/**
 * Created by Orlov Denis on 31.05.2018.
 * ru.dev30@kgk-global.com
 */
@Dao
interface InformationDao {
    @Query("SELECT * FROM Information LIMIT 1")
    fun getInformation(): Flowable<String>
}