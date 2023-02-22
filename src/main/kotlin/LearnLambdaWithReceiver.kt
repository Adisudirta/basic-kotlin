fun buildString(): String {
    val stringBuilder = StringBuilder()

    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

fun buildStringWithReceiver(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main(args: Array<String>) {
    val message = buildString()
    val message2 = buildStringWithReceiver {
        append("Hello ")
        append("World, ")
        append("I Learn ")
        append("Lambda with Receiver. ")
    }
    println(message)
    println(message2)
}