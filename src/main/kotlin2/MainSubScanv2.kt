import java.io.File
//Uppgift 1 2021. Hjälplösning: https://blog.jetbrains.com/kotlin/2021/12/advent-of-code-2021-in-kotlin-day-1/
fun readInputAsInts(name: String) = File(name).readLines().map { it.toInt() }
val jump1 = readInputAsInts("src/main/resources/Depth").windowed(2).count { (a, b) -> a < b }
val jump2 = readInputAsInts("src/main/resources/Depth").windowed(4).count { it[0] < it[3]}
fun main(){
    println(jump1)
    println(jump2)
}