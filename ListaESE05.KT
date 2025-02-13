@file:JvmName("JDoodle")
fun main(args: Array<String>) {
    print("Digite a medida em metros:")
    val metro = readln()!!.toInt()
    print("O a mediada centimetros é ${metro * 100}")
}