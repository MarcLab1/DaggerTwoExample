package com.daggertwo

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class GreenBody : Body {

    var paintVariant:String = ""

    @Inject
    constructor(paintVariant: String)
    {
        this.paintVariant = paintVariant
    }

    override fun getPaintColour(): String {
        return "green-" + paintVariant
    }


}