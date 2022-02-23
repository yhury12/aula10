fun main() {
    atividade5()
}
fun atividade1():Unit{
    println("digite o primeiro Número:")
    val value1 = readLine()!!.toFloat()
    println("digite o segundo Número:")
    val value2 = readLine()!!.toFloat()
    if (value1 > value2) {
        println("O primeiro número é o maior")
    }else {
        println("O segundo número é o menor")
    }
}

fun atividade2():Unit{
    println("Digite um número:")
    val num = readLine()!!.toFloat()
    if (num > 0){
        println("O número $num é positivo!!!")
    }else{
        println("O número $num é negativo!!!")
    }
}

fun atividade3():Unit{
    println("digite uma letra qualquer:")
    val letra = readLine()!!

    if(
        letra.equals("a",true) ||
        letra.equals("e",true) ||
        letra.equals("i",true) ||
        letra.equals("o",true) ||
        letra.equals("u",true)
    ){
        println("A letra $letra é uma vogal!!!")
    }else{
        println("A letra $letra é uma consoante")
    }
}

fun atividade4():Unit{
    val jogo = Adivinha()
    println("Digite um número de 0 a 10 para o seu palpite")
    val palpite = readLine()!!.toInt()

    if(palpite in 0 ..10){
        println(jogo.jogar(palpite))
    }else{
        println("palpite inválido!!!")
    }
}

fun atividade5():Unit{
    val jogo = Jokenpo()
    println("Digite um número entre 1 e 3 para a sua jogada")
    val jogador = readLine()!!.toInt()

    if(jogador in 1..3){
        println(jogo.jogar(jogador))
    }else{
        println("jogada inválida!!!")
    }

}