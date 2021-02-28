package me.fernando.collections

import kotlin.math.roundToInt

fun main() {
    val value = IntArray(5)
    var index = 0

    while (index < value.size) {
        value[index] = ((Math.random()*10)*2).roundToInt()
        index++
    }

    value.forEach{
        println(it)
    }
}