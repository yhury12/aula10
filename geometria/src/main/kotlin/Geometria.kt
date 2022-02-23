import kotlin.math.PI
import kotlin.math.pow

class Geometria {
    fun calcularAreaDoCirculo(raio:Double) = PI * raio.pow(2)

    fun calcularAreaDoTriangulo(base:Float,altura:Float) = base * altura / 2

    fun calcularCircunferenciaDoCirculo(raio:Float) = 2 * PI * raio
}




