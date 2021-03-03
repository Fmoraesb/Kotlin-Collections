package me.fernando.collections

import me.fernando.collections.model.media
import me.fernando.collections.model.somatoria

fun main() {
    val salarios = arrayOf(
        "3500".toBigDecimal(),
        "5000".toBigDecimal(),
        "10000".toBigDecimal(),
        "1500".toBigDecimal())

    println(salarios.somatoria())
    println("<--------------------------------------->")

    println(salarios.media())
}