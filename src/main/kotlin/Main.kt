import java.io.File

const val FOLDER = "vcs"

fun main(args: Array<String>) {
    val command = args.getOrNull(0) ?: ""
    val secondArgument = args.getOrNull(1) ?: ""
    val commands = listOf(CONFIG, ADD, COMMIT, LOG)

    if (!File(FOLDER).isDirectory && commands.contains(command)) File(FOLDER).mkdir()
    when (command) {
        CONFIG -> config(secondArgument)
        ADD -> addToIndex(secondArgument)
        COMMIT -> commit(secondArgument)
        LOG -> log()
        else -> help(command)
    }
}