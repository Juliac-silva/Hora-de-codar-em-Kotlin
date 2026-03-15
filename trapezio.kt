//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Informe a base maior: ")
    val baseMaior = readln().toDouble()
    println("Informe a base menor: ")
    val baseMenor = readln().toDouble()
    println("Informe a altura: ")
    val altura = readln().toDouble()
    val area = (baseMaior + baseMenor) * altura / 2
    println("A área do Trapézio é igual a: $area")
}