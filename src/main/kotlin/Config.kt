import java.io.File

const val CONFIG = "config"
private val CONFIG_FILE = File("$FOLDER/config.txt")

fun config(userName: String) {
    val name = if (userName.isNotEmpty()) {
        CONFIG_FILE.writeText(userName)
        userName
    } else if (CONFIG_FILE.isFile) CONFIG_FILE.readText() else ""

    println(if (name.isEmpty()) "Please, tell me who you are." else "The username is $name.")
}