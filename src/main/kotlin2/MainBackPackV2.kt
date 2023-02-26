import java.io.File
//Uppgift 3 2022. Lösningshjälp: https://todd.ginsberg.com/post/advent-of-code/2022/day3/
var vList = ArrayList<Int>()
var vList2 = ArrayList<Int>()

fun readFiles(fileName: String): List<String>
        = File(fileName).readLines()

fun Char.priority(): Int =
    when (this) {
        in 'a'..'z' -> (this - 'a') + 1
        in 'A'..'Z' -> (this - 'A') + 27
        else -> throw IllegalArgumentException("Letter not in range: $this")
    }
fun main() {
    //del1
    val packList = readFiles("src/main/resources/Itemlist")

    for (String in packList) {
        val (part1, part2) = String.chunked(String.length / 2).map { it.toSet() }
        vList.add(part1.intersect(part2).first().priority())
    }

            println(vList.sum())

    //del 2


    val listOf3 = packList.chunked(3) { it.toSet() }
    for (Unit in listOf3) {
        val (part1, part2, part3) = Unit.map { it.toSet() }
        vList2.add(part1.intersect(part2).intersect(part3).first().priority())
    }

        println(vList2.sum())

    }


