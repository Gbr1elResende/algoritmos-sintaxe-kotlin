@file:JvmName("JDoodle")
fun main(args: Array<String>) {
 print("Digite o comprimento de um dos lados do quadrado: ")
    val comprimento = readln().toDouble()
    val area = (comprimento * comprimento)
    println("O dobro da área do quadrado é: ${area*2}")
}