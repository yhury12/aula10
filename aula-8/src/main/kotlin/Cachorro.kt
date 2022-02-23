class Cachorro (
    var raca:String,
    peso:Float,
    altura:Short
) : Mamifero(
    peso,
    altura
){
    override fun comer(): String = "Estou comendo raçâo de cachorro!!!"
    override fun emitirSom(): String = "Estou latindo como um cachorro!!!"
    override fun amamentar(): String = "Vou amamentar com um cachorro!!!"
}
