package com.daggertwo

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class Car {

    companion object {
        var _id: Int = 1
    }

    lateinit var engine: Engine
    lateinit var wheels: Wheels
    lateinit var body: Body
    lateinit var driver: Driver

    //Field Injection inside a class
    //Inject on the field AND inject in the constructor of that object
    @Inject
    lateinit var transmission: Transmission

    var id: Int = 0
    var fobNumber:Int = 0

    @Inject
    constructor(engine: Engine, wheels: Wheels, body:Body, transmission: Transmission, driver:Driver) {
        this.engine = engine
        this.wheels = wheels
        this.body = body
        this.transmission = transmission
        this.driver = driver
        this.id = _id++
        Log.d(TAG, "#" + id.toString() + " car created")
    }

    //method injection
    //creates the Remote instance and passes along this car
    @Inject
    fun providesCarToRemote(remote:Remote)
    {
        remote.providesCar(this)
    }

    fun getCarInfo(): String {
        return "Car #" + id + " has been created by Dagger2 and is named " + this.toString() + ".\n" +
        "This car is painted " +
                this.body.getPaintColour() + " with " + this.wheels.wheelsType + " wheels, which include " +
                this.wheels.rims.rimsType + " rims and " + this.wheels.tires.tiresType + " tires.\n" +
                 "The car has remote fob number " + fobNumber + " and has " + transmission.gears + " gears.\n" +
                 "The driver of the car was also created by Dagger2 and is named " + this.driver
    }

}