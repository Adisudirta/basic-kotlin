fun sayHi(name: String): Unit = println("Hi $name")

fun multiplication(a: Int, b: Int): Int = a * b

fun main() {
    val multiplicationResult: Int = multiplication(9, 9)
    println("The result is $multiplicationResult!")
    sayHi("Adi")
}