import java.io.File
//uppgift 2 2021
var aim = 0
var depth = ArrayList<Int>()
var forward = ArrayList<Int>()
var down = ArrayList<Int>()
var up = ArrayList<Int>()

fun readFile2(fileName: String)
        = File(fileName).readLines()

fun main() {
    val courseList = readFile2("src/main/resources/SubCoords")

    for (String in courseList){
        if(String.first()=='f')
            forward.add(String.last().digitToInt())
        else if(String.first()=='d')
            down.add(String.last().digitToInt())
        else
            up.add(String.last().digitToInt())
    }
    println((down.sum()-up.sum())*forward.sum())

    //del 2
    for (String in courseList){
        if(String.first()=='f')
            depth.add(aim * String.last().digitToInt())
        else if(String.first()=='d')
            aim += String.last().digitToInt()
        else
            aim -= String.last().digitToInt()
    }
    println(forward.sum()*depth.sum())
}