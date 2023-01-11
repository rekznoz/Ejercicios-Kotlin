class Pila<T> {
    private val p = mutableListOf<T>()

    fun tope(): T? {
        return if (p.isNotEmpty()) p.last() else null
    }

    fun push(element: T) {
        p.add(element)
    }

    fun pop(): T? {
        return if (p.isNotEmpty()) p.removeLastOrNull() else null
    }

    fun vacia(): Boolean {
        return p.isEmpty()
    }

    override fun toString():String {
        return p.toString()
    }
}

fun <T> reverse(list: List<T>): List<T> {
    val p = Pila<T>()
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        p.push(iterator.next())
    }
    val invertida = mutableListOf<T>()
    while (!p.vacia()) {
        invertida.add(p.pop()!!)
    }
    return invertida
}

fun main() {

    // PILA //
    //////////
    var numbers = listOf("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Cero")
    var numbersRev = reverse(numbers)

    if (!listOf("Cero", "Nueve", "Ocho", "Siete", "Seis", "Cinco", "Cuatro", "Tres", "Dos", "Uno").equals(numbersRev))
        println("Error")
    else
        println("Correcto")

    println(numbersRev)

}