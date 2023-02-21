fun toUpper(value: String): String = value.uppercase()

fun main() {
//    lambda default syntax
    val formatString1: (String) -> String = {value: String -> value.uppercase() }

//    lambda using "it" expression
    val formatString2: (String) -> String = {
        it.lowercase()
    }

//    refrenced to other function
    val formatString3: (String) -> String = ::toUpper

    println(formatString1("adi sudirta"))
    println(formatString2("ADI SUDIRTA"))
    println(formatString3("adi sudirtayasa"))
}