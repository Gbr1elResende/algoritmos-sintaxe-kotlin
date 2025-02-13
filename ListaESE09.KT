@file:JvmName("JDoodle")
fun main(args: Array<String>) {
 print("Digite a temperatura em Fahrenheit: ")
    val Fahrenheit = readln().toDouble()
    println("A temperatura em graus Celsius é: ${5 * ((Fahrenheit - 32) / 9)}")
}