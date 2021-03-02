package me.fernando.collections

fun main() {
    val func1 = Funcionario(nome = "Klaus", salario = 12300.00)
    val func2 = Funcionario(nome = "Fernando", salario = 2500.00)
    val func3 = Funcionario(nome = "Isabela", salario = 4500.00)

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
}

data class Funcionario (
    val nome : String,
    val salario : Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: ${"R$%.2f".format(salario)}
        """.trimIndent()
}