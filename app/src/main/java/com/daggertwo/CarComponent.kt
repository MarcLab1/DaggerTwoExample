package com.daggertwo

import dagger.Component
import javax.inject.Singleton

//Dagger will create a class called DaggerCarCompnent that implements
//this interface.
//This inclides the implementation of any defined methods
@Singleton
@Component(modules = [GreenBodyModule::class, WheelsModule::class])
interface CarComponent {

    fun getCar(): Car

    //field injection
    fun inject(mainActivity: MainActivity)
}