package com.daggertwo

import dagger.Module
import dagger.Provides

@Module
class GreyBodyModule {

    @Provides
    fun providesGreyBody(paintVariant : String): Body {
        return GreyBody(paintVariant)
    }
}
