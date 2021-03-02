package me.fernando.collections

fun main() {
    val salarios = doubleArrayOf(1200.00, 4000.00, 2500.55, 10540.99, 3200.00)

    for (salario in salarios) {
        println("%.2f".format(salario))
    }
    println("<------------------------------------------>")

    println("Maior Salário:  ${salarios.max()}")
    println("Menor Salário: ${salarios.min()}")
    println("Media Salarial: ${"%.2f".format(salarios.average())}")
    println("<------------------------------------------>")

    var salarioMaiorQue2500 = salarios.filter { it > 2500.00 }
    salarioMaiorQue2500.forEach{
        println("%.2f".format(it))
    }
    println("<------------------------------------------>")

    println(salarios.find { it <= 2500.00 })
    println("<------------------------------------------>")

    println(salarios.find { it == 1500.00 })
    println("<------------------------------------------>")

    println(salarios.any {it > 2500.00})
    println("<------------------------------------------>")

    println(salarios.any { it < 100.00 })
}