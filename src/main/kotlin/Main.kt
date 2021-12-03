import java.io.File

const val FOLDER = "vcs"

fun main(args: Array<String>) {
    val command = args.getOrNull(0) ?: ""
    val secondArgument = args.getOrNull(1) ?: ""
    val commands = listOf(CONFIG, ADD)

    if (!File(FOLDER).isDirectory && commands.contains(command)) File(FOLDER).mkdir()
    when (command) {
        CONFIG -> config(secondArgument)
        ADD -> add(secondArgument)
        else -> help(command)
    }
}