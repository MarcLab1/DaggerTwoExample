package com.daggertwo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class BlueBodyModule {

    @Binds
    abstract fun providesBlueBody(bluebody: BlueBody) : Body

}