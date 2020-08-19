package com.daggertwo

import javax.inject.Inject

class Transmission {

    var gears : Int =0
    @Inject
    constructor() {

        gears = 5
    }
}