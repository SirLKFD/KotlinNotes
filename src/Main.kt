val name = "Lord Kent"
var greeting: String? = null

fun main() {
    greeting = "Hello"
    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
   println(greetingToPrint)
    println(name)
}