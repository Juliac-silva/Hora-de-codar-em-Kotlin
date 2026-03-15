//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   println("Informe a diagonal maior: ")
    val diagonalMaior = readln().toDouble()
    println("Informe a diagonal menor: ")
    val diagonalMenor = readln().toDouble()
    val area = (diagonalMaior * diagonalMenor) / 2
    println ("A área do losango é igual a: $area")
}