package com.daggertwo

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class RedBody : Body {

    var paintVariant:String = ""

    @Inject
    constructor(paintVariant: String)
    {
        this.paintVariant = paintVariant
    }

    override fun getPaintColour(): String {
        return "red-" + paintVariant
    }


}