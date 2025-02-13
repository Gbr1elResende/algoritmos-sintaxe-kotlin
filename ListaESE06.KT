@file:JvmName("JDoodle")
fun main(args: Array<String>) {
 print("Digite o raio do círculo: ")
    val raio = readln().toDouble()
    val area = (raio * raio) * 3.14
    println("A área do círculo é: $area")
}