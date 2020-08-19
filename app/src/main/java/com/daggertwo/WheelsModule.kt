package com.daggertwo

import dagger.Module
import dagger.Provides

//Necessary to create this module because Wheels is owned by a 3rd party
//and we cannot inject the constructor
@Module
class WheelsModule {

    @Provides
    fun providesRims(): Rims{
        return Rims()
    }
    @Provides
    fun providesTires(): Tires{
        var tires : Tires = Tires()
        tires.tiresType = "Michelin"
        return tires
    }

    @Provides
    fun providesWheels(rims:Rims, tires: Tires) : Wheels{
        var wheels = Wheels(rims, tires)
        wheels.wheelsType = "Sport"
        return wheels
    }
}