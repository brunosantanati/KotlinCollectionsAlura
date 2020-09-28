package br.com.alura.list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val meusLivros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    val livro5 = Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )

    meusLivros.add(livro5)

    meusLivros.imprimeComMarcadores()

    meusLivros.remove(livro1)

    meusLivros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = meusLivros.sorted()

    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = meusLivros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    meusLivros.sortedBy { it.autor }.imprimeComMarcadores()
}

fun List<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor} - ${it.anoPublicacao}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}