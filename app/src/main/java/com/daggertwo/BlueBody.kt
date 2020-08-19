package com.daggertwo

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class BlueBody : Body {

    @Inject
    constructor()
    {

    }

    override fun getPaintColour(): String {
        return "blue"
    }


}