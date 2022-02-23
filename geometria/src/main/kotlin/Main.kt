fun main() {
    val geometria = Geometria()

    val areaDoCiruculo = geometria.calcularAreaDoCirculo(raio = 2.0)

    val areaDoTriangulo = geometria.calcularAreaDoTriangulo(2f,3f)

    val circunferenciaDoCirculo = geometria.calcularCircunferenciaDoCirculo(15f)
    println("AreaDoCirculo: $areaDoCiruculo")
    println("AreaDoTriangulo: $areaDoTriangulo")
    println("CircunferenciaDoCirculo: $circunferenciaDoCirculo")
}

