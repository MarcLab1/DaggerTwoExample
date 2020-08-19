package com.daggertwo

import javax.inject.Inject
import kotlin.random.Random

class Remote {

    lateinit var car:Car
    @Inject
    constructor()


    fun providesCar(car: Car)
    {
        this.car = car
        car.fobNumber = Random.nextInt(99999)
    }
}