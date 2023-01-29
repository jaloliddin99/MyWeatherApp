package com.plcoding.weatherapp.di

import com.plcoding.weatherapp.data.location.DefaultLocationTracker
import com.plcoding.weatherapp.domain.location.LocationTracker
import dagger.Binds
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@dagger.Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {
    @OptIn(ExperimentalCoroutinesApi::class)
    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker):LocationTracker

}