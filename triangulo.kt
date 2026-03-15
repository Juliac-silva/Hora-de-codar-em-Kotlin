//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  println("Informe a base: ")
    val base = readln().toDouble()
    println("Informe a altura: ")
    val altura = readln().toDouble()
    val area = (base*altura)/2
    println("A área do triângulo é: $area")
}