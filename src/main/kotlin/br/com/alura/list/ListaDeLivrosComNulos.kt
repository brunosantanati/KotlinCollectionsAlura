package br.com.alura.list

fun main() {
    //listaLivrosComNulos.imprimeComMarcadores()

    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}