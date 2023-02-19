fun sayyHelloWithDefault(firstName: String, lastName: String = ""): Unit{
    println("Hello ${firstName} ${lastName}")
}

fun main() {
    sayyHelloWithDefault("Adi")
    sayyHelloWithDefault("Adi", "Sudirta")
}