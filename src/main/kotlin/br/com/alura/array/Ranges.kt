package br.com.alura.array

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print("$s ")
    }

    separador()

    val numerosPares = 2..100 step 2
    for(numeroPar in numerosPares){
        print("$numeroPar ")
    }

    separador()

    val zeroAte99 = 0.until(100)
    zeroAte99.forEach { print("$it ") }

    separador()

    val numerosParesReverso = 100 downTo 0 step 2
    //numerosParesReverso.forEach({ print("$it ") })
    //numerosParesReverso.forEach() { print("$it ") }
    numerosParesReverso.forEach { print("$it ") }

    separador()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if(salario in intervalo){
        print("Está dentro do intervalo")
    }else{
        print("Não está dentro do intervalo")
    }

    separador()

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
    val letraMaiuscula = 'K'
    println(letraMaiuscula in alfabeto)
}

fun separador(){
    println()
    println("##########################################")
}