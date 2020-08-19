package com.daggertwo

import dagger.Component
import javax.inject.Singleton

//Dagger will create a class called DaggerCarCompnent that implements
//this interface.
//This inclides the implementation of any defined methods
@Singleton
@Component(modules = [RedBodyModule::class, WheelsModule::class])
interface CarComponentTwo {

    fun getCar(): Car

    //field injection
    fun inject(mainActivity: MainActivity)
}