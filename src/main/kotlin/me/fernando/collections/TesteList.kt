package me.fernando.collections

import me.fernando.collections.model.Funcionario

fun main() {
    val func1 = Funcionario(nome = "Klaus", salario = 12300.00, tipoContratacao = "CLT")
    val func2 = Funcionario(nome = "Fernando", salario = 2500.00, tipoContratacao = "CLT")
    val func3 = Funcionario(nome = "Isabela", salario = 4500.00, tipoContratacao = "PJ")

    val funcionarios = listOf(func1,func2,func3)
    funcionarios.forEach {
        println(it)
    }
    println("<--------------------------------------->")

    println(funcionarios.find { it.nome == "Klaus" })
    println("<--------------------------------------->")

    funcionarios
        .sortedBy {it.salario}
        .forEach {println(it)}
    println("<--------------------------------------->")
    
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}