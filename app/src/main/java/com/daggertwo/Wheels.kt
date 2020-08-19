package com.daggertwo

import javax.inject.Inject

//Wheels is a 3rd party library and we cannot inject the constructor
class Wheels {

    var wheelsType : String = ""
    lateinit var rims:Rims
    lateinit var tires:Tires

    constructor(rims:Rims, tires:Tires) {
        this.rims = rims
        this.tires = tires
    }
}