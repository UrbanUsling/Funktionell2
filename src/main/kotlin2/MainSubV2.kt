import java.io.File

//uppgift 2 2021. Lösningshjälp
    var aim2 = 0
    var depth2 =0
    var forward2 = 0
    var down2 = 0
    var up2 = 0

    fun readFile3(fileName: String) = File(fileName).readLines()

fun main() {
        val courseList2 = readFile3("src/main/resources/SubCoords")
        for (command in courseList2) {
            command.split(" ").let {
                (it.first()); (it.last().toInt())
                when (it.first()) {
                    "forward" -> forward2 += it.last().toInt()
                    "down" -> down2 += it.last().toInt()
                    "up" -> up2 += it.last().toInt()
                }
            }
        }
        println((down2-up2)*forward2)
        //del2
        for (command in courseList2) {
            command.split(" ").let {
                (it.first()); (it.last().toInt())
                when (it.first()) {
                    "forward" -> depth2 += aim2 * it.last().toInt()
                    "down" -> aim2 += it.last().toInt()
                    "up" -> aim2 -= it.last().toInt()
                }
            }
        }
        println(forward2*depth2)

    }
