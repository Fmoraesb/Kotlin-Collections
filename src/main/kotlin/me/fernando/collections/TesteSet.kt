package me.fernando.collections

import me.fernando.collections.model.Funcionario

fun main() {
    val func1 = Funcionario(nome = "Klaus", salario = 12300.00, tipoContratacao = "CLT")
    val func2 = Funcionario(nome = "Fernando", salario = 2500.00, tipoContratacao = "CLT")
    val func3 = Funcionario(nome = "Isabela", salario = 4500.00, tipoContratacao = "PJ")

    val funcionarios1 = setOf(func1, func2)
    val funcionarios2 = setOf(func3)

    var resultFuncionario = funcionarios1.union(funcionarios2)
    resultFuncionario.forEach {
        println(it)
    }
    println("<--------------------------------------->")

    val funcionarios3 = setOf(func1,func2,func3)
    var resultSubstract = funcionarios3.subtract(funcionarios2)
    resultSubstract.forEach {
        println(it)
    }
}