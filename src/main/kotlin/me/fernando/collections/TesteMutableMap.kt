package me.fernando.collections

import me.fernando.collections.model.Funcionario
import me.fernando.collections.model.Repositorio

fun main() {
    val func1 = Funcionario(nome = "Klaus", salario = 12300.00, tipoContratacao = "CLT")
    val func2 = Funcionario(nome = "Fernando", salario = 2500.00, tipoContratacao = "CLT")
    val func3 = Funcionario(nome = "Isabela", salario = 4500.00, tipoContratacao = "PJ")

    val repository = Repositorio<Funcionario>()
    repository.create(func1.nome, func1)
    repository.create(func2.nome, func2)
    repository.create(func3.nome, func3)

    println(repository.findById(func1.nome))
    println("<--------------------------------------->")

    repository.findAll().forEach{
        println(it)
    }
    println("<--------------------------------------->")

    repository.remove(func2.nome)
    repository.findAll().forEach {
        println(it)
    }
}