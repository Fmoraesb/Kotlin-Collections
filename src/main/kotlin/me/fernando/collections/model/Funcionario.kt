package me.fernando.collections.model

data class Funcionario (
    val nome : String,
    val salario : Double,
    val tipoContratacao : String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: ${"R$%.2f".format(salario)}
        """.trimIndent()
}