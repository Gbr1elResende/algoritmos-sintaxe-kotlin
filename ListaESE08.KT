@file:JvmName("JDoodle")
fun main(args: Array<String>) {
 print("Digite quanto você ganha por hora: ")
    val salarioHora = readln().toInt()
    print("Quantas horas vc trabalha por mês: ")
    val horasMes = readln().toInt()
    println("O seu salário por mês é: ${horasMes * salarioHora}")
}