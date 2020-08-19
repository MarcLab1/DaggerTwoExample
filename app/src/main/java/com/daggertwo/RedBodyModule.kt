package com.daggertwo

import dagger.Module
import dagger.Provides

@Module
class RedBodyModule {

    var paintVariant: String = ""

    constructor(paintVariant: String) {
        this.paintVariant = paintVariant
    }


    @Provides
    fun providesRedBody(): Body {
        return RedBody(paintVariant)
    }
}
