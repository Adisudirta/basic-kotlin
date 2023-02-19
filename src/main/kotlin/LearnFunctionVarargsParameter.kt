fun sum(vararg numbers: Int): Int{
    var total: Int = 0

    for (number in numbers){
        total += number
    }

    return total
}

fun main() {
    println(sum(10,10,10,10,10))
}