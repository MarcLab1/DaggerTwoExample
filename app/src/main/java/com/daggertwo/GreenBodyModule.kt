package com.daggertwo

import dagger.Module
import dagger.Provides

@Module
class GreenBodyModule {

    @Provides
    fun providesGreenBody() : Body
    {
        return GreenBody("pearl")
    }
}