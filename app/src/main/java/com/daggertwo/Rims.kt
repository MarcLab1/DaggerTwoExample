package com.daggertwo

import javax.inject.Inject

class Rims {

    var rimsType : String = ""

    @Inject
    constructor() {
        rimsType = "Chrome"
    }
}