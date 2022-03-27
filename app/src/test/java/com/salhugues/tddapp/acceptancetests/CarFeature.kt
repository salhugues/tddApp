package com.salhugues.tddapp.acceptancetests

import com.salhugues.tddapp.Car
import org.junit.Assert.assertEquals
import org.junit.Test

class CarFeature {

    private val car = Car(6.0)

    @Test
    fun `Car loosing fuel when it turned on`() {
        car.turnOn()

        assertEquals(5.5, car.fuel, 0.0)
    }
}
