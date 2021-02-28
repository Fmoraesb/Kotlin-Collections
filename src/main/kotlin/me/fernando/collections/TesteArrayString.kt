package me.fernando.collections

fun main() {
    val nomes = Array(5) {""}
    nomes[0] = "Fernando"
    nomes[1] = "Isabela"
    nomes[2] = "Klaus"
    nomes[3] = "Lyra"
    nomes[4] = "Link"

    for (nome in nomes) {
        println(nome)
    }
    println("<------------------------------------------>")

    nomes.forEach {
        println(it)
    }
    println("<------------------------------------------>")

    nomes.sort()
    nomes.forEach {
        println(it)
    }
}