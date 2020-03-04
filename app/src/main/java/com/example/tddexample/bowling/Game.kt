package com.example.tddexample.bowling

class Game {
    val rolled = IntArray(22)
    private var currentBall = 0

    fun roll(pins: Int) {
        rolled[currentBall]= pins
        currentBall++
    }

    fun score(): Int {
        var score = 0
        for (i in 0 until 20) {
            if (rolled[i] + rolled[i + 1] == 10) {
                score += rolled[i + 2]
            } else {
                score += rolled[i]
            }
        }
        return score
    }
}

