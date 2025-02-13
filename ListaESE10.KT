@file:JvmName("JDoodle")
fun main(args: Array<String>) {
 print("Digite a temperatura em Celsius: ")
    val Celsius = readln().toDouble()
    println("A temperatura em Fahrenheit é: ${(Celsius * 1.8) + 32}")
}