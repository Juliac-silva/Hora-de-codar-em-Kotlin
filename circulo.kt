import kotlin.math.PI

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  println("Informe o raio do círculo: ")
    val raio = readln().toDouble()
    val area = PI * raio * raio
    println("A área do círculo é: $area²")
    }