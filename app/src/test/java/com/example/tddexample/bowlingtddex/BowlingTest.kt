package com.example.tddexample.bowlingtddex

import com.example.tddexample.bowling.Game
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

class BowlingTest {

    lateinit var game: Game
    @Before
    fun setUp() {
        game = Game()
    }

    @Test
    fun rollZeroScoreIsZero() {
        game.roll(0)
        assertEquals(0, game.score())
    }

    @Test
    fun openFrameAddsPins() {
        game.roll(3)
        game.roll(2)
        assertEquals(5, game.score())
    }

    @Test
    @Ignore
    fun spareAddNextPins() {
        game.roll(4)
        game.roll(6)
        game.roll(3)
        game.roll(0)
        assertEquals(16, game.score())
    }
}