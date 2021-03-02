package me.fernando.collections

fun main() {
    val pair : Pair<String, Double> = Pair("Fernando", 3500.00)
    val map1 = mapOf(pair)

    map1.forEach { (nome, salario) -> println("Chave: $nome - Valor: ${"%.2f".format(salario)}")  }
    println("<--------------------------------------->")

    val map2 = mapOf(
        "Isabela" to 5650.00,
        "Klaus" to 12450.00
    )
    map2.forEach { (nome, salario) -> println("Chave: $nome - Valor: ${"%.2f".format(salario)}")  }
    println("<--------------------------------------->")

    val map3 = map1.plus(map2)

    map3.forEach { (nome, salario) -> println("Chave: $nome - Valor: ${"%.2f".format(salario)}")  }
}