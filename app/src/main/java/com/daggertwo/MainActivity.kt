package com.daggertwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var textView1 : TextView
    lateinit var textView2 : TextView
    lateinit var textView3 : TextView
    lateinit var textView4 : TextView
    lateinit var car1:Car
    lateinit var car2:Car
    lateinit var car3:Car

    //We use Field inejection inside the activity, so we inject car4 instance manually
    @Inject
    lateinit var car4:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = this.findViewById(R.id.textView1)
        textView2 = this.findViewById(R.id.textView2)
        textView3 = this.findViewById(R.id.textView3)
        textView4 = this.findViewById(R.id.textView4)
        var carComponent = DaggerCarComponent.create()

        //Constructor injection
        car1 = carComponent.getCar()
        textView1.text = car1.getCarInfo()
        car2 = carComponent.getCar()
        textView2.text = car2.getCarInfo()

        var carComponentTwo = DaggerCarComponentTwo.builder()
            .redBodyModule(RedBodyModule("opal")).build()
        car3 = carComponentTwo.getCar()
        textView3.text = car3.getCarInfo()

        var carComponentThree = DaggerCarComponentThree.builder()
           .providesGreyBody("metallic")
           .build()

        //Field injection inside an activity
       carComponentThree.inject(this)
       textView4.text = car4.getCarInfo()

    }
}