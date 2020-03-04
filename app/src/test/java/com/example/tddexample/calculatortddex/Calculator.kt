package com.example.tddexample.calculatortddex

import com.example.tddexample.calculator.Calculator
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    private lateinit var calculator: Calculator
    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun addTwoDigits() {
        val result = calculator.addTwoDigits(2, 3)
        Assert.assertEquals(result, 5)
    }
}