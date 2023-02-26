//Uppgift 3 2022
import java.io.File


var charList = ArrayList<Char>()
var charList2 = ArrayList<Char>()
var valueList = ArrayList<Int>()
var valueList2 = ArrayList<Int>()

fun readFile(fileName: String): List<String>
        = File(fileName).readLines()

fun main() {
    //del1
    val packList = readFile("src/main/resources/Itemlist")

    for (String in packList) {
        val (part1, part2) = String.chunked(String.length / 2).map { it.toSet() }
        charList.add(part1.intersect(part2).first())
    }


        for (Char in charList) {
            if (Char.isUpperCase())
                valueList.add(Char.hashCode() - 38)
            else
                valueList.add(Char.hashCode() - 96)
        }


    println(valueList.sum())

    //del 2


        val listOf3 = packList.chunked(3) { it.toSet() }
        for (Unit in listOf3) {
            val (part1, part2, part3) = Unit.map { it.toSet() }
            charList2.add(part1.intersect(part2).intersect(part3).first())
        }

    for (Char in charList2) {
        if (Char.isUpperCase())
            valueList2.add(Char.hashCode() - 38)
        else
            valueList2.add(Char.hashCode() - 96)
    }
    println(valueList2.sum())


}






