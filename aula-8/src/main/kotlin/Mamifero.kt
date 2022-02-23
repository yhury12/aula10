abstract class Mamifero (
    peso:Float,
    altura:Short
) : Animal(
    peso,
    altura
){
    open fun amamentar(): String = "Amamentando como um mamífero BEM GENÉRICO"
}
