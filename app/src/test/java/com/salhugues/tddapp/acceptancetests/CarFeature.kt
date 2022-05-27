package com.salhugues.tddapp.acceptancetests

import com.salhugues.tddapp.Car
import com.salhugues.tddapp.Engine
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class CarFeature {

    private val engine = Engine()
    private val car = Car(6.0)

    @Test
    fun `Car loosing fuel when it turned on`() {
        car.turnOn()
        assertEquals(5.5, car.fuel, 0.0)
    }

    @Test
    fun `The car is turningOn It Engine and increases the temperature`() {
        car.turnOn()
        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}
