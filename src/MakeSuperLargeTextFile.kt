import java.io.File

fun main() {
    val superLargeFile = File("superLargeFile.txt")
    superLargeFile.createNewFile()
    for(i in 1..400_000) {
        if(i%100_000 == 0) println(i)
        superLargeFile.appendText("1".repeat(10000))
    }
}