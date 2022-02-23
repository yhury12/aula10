fun main() {
    atividade4()
}

fun atividade1(): Unit{
    println("Digite a primeira nota:")
    val nota1 = readLine()!!.toFloat()
    println("Digite a segunda nota:")
    val nota2 = readLine()!!.toFloat()
    val media = (nota1 + nota2) / 2
    if(media >=9)
        println("O aluno foi aprovado com merito!!!")
    else if (media >=6)
        println("O aluno foi aprovado !!!")
    else if (media >=4)
        println("o aluno esta de recuperacao!!!")
    else if (media <4)
        println("o aluno foi reprovado")
    else
        println("recuperacao invalida")


}

fun atividade2(): Unit{
    println("escolha o genero com o qual se identifica: \nM - Masculino\nF - Feminino\nO - Outros")
    val genero = readLine()!!
    if(genero.equals("m",true))
        println("Bem vindo senhor...")
    else if(genero.equals("f",true))
        println("bem vinda senhora...")
    else if(genero.equals("o",true))
        println("bem vindo...")
    else
        println("genero invalido")

}

fun atividade3(): Unit{
    println("digite primeiro o numero:")
    val num1 = readLine()!!.toFloat()
    println("digite o segundo numero:")
    val num2 = readLine()!!.toFloat()

    println("escolha uma operacao:\n1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao")

    when(readLine()!!.toInt()){
        1 ->println("A soma é ${num1 + num2}")
        2 -> println("A subtracao é ${num1 - num2}")
        3 -> println("A multiplicacao é ${num1 * num2}")
        4 -> println("A divisao é ${num1 / num2}")
        else -> println("operacao invalida!!!")
    }
}

fun atividade4(): Unit{
    println("Digite o total da compra:")
    val totalDaCompra = readLine()!!.toFloat()
    println("Escolha o tipo de cliente:\n1 - cliente comum\n2 - cliente VIP\n3 - funcionario")

    when(readLine()!!.toInt()){
        1 -> println("O total da compra é $totalDaCompra")
        2 -> println("O total da compra é ${totalDaCompra - totalDaCompra * 00.5}")
        3 -> println("O total da compra é ${totalDaCompra - totalDaCompra * 0.10}")
        else -> println("tipo de cliente invalido")
    }
}