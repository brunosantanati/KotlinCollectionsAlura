package br.com.alura.array

fun main() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if(maiorIdade < idade){
            maiorIdade = idade
        }
    }

    println(maiorIdade)
}