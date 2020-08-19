package com.daggertwo

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

//Dagger will create a class called DaggerCarCompnent that implements
//this interface.
//This inclides the implementation of any defined methods
@Singleton
@Component(modules = [GreyBodyModule::class, WheelsModule::class])
interface CarComponentThree {

    fun getCar(): Car

    //field injection
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun providesGreyBody(paintVariant:String) : Builder

        fun build(): CarComponentThree
    }
}