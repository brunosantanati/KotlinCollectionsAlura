package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salarios.contentToString())

    //aumento de salários
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    //gasto mensal/inicial com pagamento de salários
    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    //gasto inicial mais o gasto com seis meses de pagamento de salários
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)
    //println(gastoInicial + (gastoInicial * 6.toBigDecimal()))

    //média dos 3 maiores salários
    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(media)

    //média dos 3 menores salarios
    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    
    println(mediaMenoresSalarios)

}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}