package me.fernando.collections

import kotlin.math.roundToInt

fun main() {
    val values = intArrayOf(2,4,6,5,9,8)

    values.forEach {
        println(it)
    }
    println("<------------------------------------------>")

    values.sort()
    values.forEach {
        println(it)
    }
}