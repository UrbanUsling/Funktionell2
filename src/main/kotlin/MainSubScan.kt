import java.io.File
//uppgift 1 2021
var drops  = -1
var drops2 = -1
var tripleJump = ArrayList<Int>()

fun readDepth(fileName: String)
        = File(fileName).readLines()

fun main(){
    var scan = readDepth("src/main/resources/Depth")
    var i = 0
    for (number in scan) {
        i = if(number.toInt() > i) {
            drops++
            number.toInt()
        }else
            number.toInt()
    }
    println(drops)
    //part2
    var j = 0
    while(j<scan.size-2){
        tripleJump.add(scan[j].toInt()+scan[j+1].toInt()+scan[j+2].toInt())
        j++
    }
    var k = 0
    for (number in tripleJump) {
        k = if(number > k) {
            drops2++
            number
        }else
            number
    }
    println(drops2)
}