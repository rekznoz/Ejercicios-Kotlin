open class Ruido(private val sonido: String) {
    fun hacerRuido() = println(sonido)
}

class Canto: Ruido("Pio")

class Mugido: Ruido("Muuh")

fun main() {

    val Pajaro = Canto()
    val Vaca = Mugido()
    Pajaro.hacerRuido()
    Vaca.hacerRuido()

}

/*
c) Di que tipo de herencia es: (Especialización, Extensión, Especificación, Construcción).
- Es de especificacion.

d) ¿Quién es la superclase y subclase?
- La super clase es Ruido y las subclases son Canto y Mugido.

e) ¿Existe otra forma de implementarlo que no sea a través de la herencia?
- Se podria hacer con funciones separadas para cada tipo de sonido.

f) Piensa y comenta qué ventajas aporta esta implementación de herencia, con respecto a otra.
- Permite tener un codigo mas organizado y la posobilidad de utilizar codigo ya escrito que va a ser
necesario mas adelante en el programa, que seria poco probable de reutilizar si estuviera dividido en funciones.
 */