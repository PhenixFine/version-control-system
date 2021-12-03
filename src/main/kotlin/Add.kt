import java.io.File

const val ADD = "add"
private val INDEX = File("$FOLDER/index.txt")

fun add(fileName: String) = if (fileName.isNotEmpty()) addFile(fileName) else printIndex()

private fun addFile(fileName: String) {
    if (File(fileName).isFile) {
        if (INDEX.isFile && INDEX.readLines().contains(fileName)) {
            println("$fileName is already added.")
        } else {
            INDEX.appendText("$fileName\n")
            println("The file '$fileName' is tracked.")
        }
    } else println("Can't find '$fileName'.")
}

private fun printIndex() {
    if (INDEX.isFile) {
        println("Tracked files:")
        print(INDEX.readText())
    } else help("add")
}