package com.salhugues.tddapp.unitests

import com.salhugues.tddapp.Car
import org.junit.Assert.assertEquals
import org.junit.Test

class CarShould {

    private val car = Car(5.0)

    @Test
    fun `Loose fuel when is turned on`() {
        car.turnOn()
        assertEquals(4.5, car.fuel, 0.0)
    }
}
