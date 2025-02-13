@file:JvmName("JDoodle")
fun main(args: Array<String>) {
    print("Digite um número:")
    val numero = readln()!!.toInt()
    print("Digite outro número:")
    val numero2 = readln()!!.toInt()
    
    print("A soma dos números é: ${numero + numero2}")
}