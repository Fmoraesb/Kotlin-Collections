package me.fernando.collections


fun main() {
    val salarios = DoubleArray(5)
    var indice = 0

    while (indice < salarios.size) {
        salarios[indice] = ((Math.random()*10000)*2)
        indice++
    }
    salarios.forEach {
        println("%.2f".format(it))
    }
    println("<------------------------------------------>")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.5
    }

    salarios.forEach {
        println("%.2f".format(it))
    }
    println("<------------------------------------------>")

    val salarios2 = doubleArrayOf(1200.00, 4000.00, 2500.55, 10540.99)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }
}