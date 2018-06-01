package com.medone.rudev30.archtest.di

import android.arch.lifecycle.ViewModelProvider
import com.medone.rudev30.archtest.ui.detail.DetailViewModel
import dagger.Binds
import dagger.multibindings.IntoMap

/**
 * Created by Orlov Denis on 01.06.2018.
 * ru.dev30@kgk-global.com
 */
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    abstract fun detailViewModel(detailViewModule:DetailViewModel)
}