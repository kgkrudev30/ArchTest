package com.medone.rudev30.archtest.di

import kotlin.reflect.KClass
import android.arch.lifecycle.ViewModel

/**
 * Created by Orlov Denis on 01.06.2018.
 * ru.dev30@kgk-global.com
 */

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.RUNTIME)
annotation class ViewModelKey (
    val value: KClass<out ViewModel>
)