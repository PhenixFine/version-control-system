const val MAX_SPACE = 11 // largest command length in HELP_MAP + 3
val HELP_MAP = mapOf(
    "config" to "Get and set a username.",
    "add" to "Add a file to the index.",
    "log" to "Show commit logs.",
    "commit" to "Save changes.",
    "checkout" to "Restore a file."
)

fun main(args: Array<String>) {
    if (args.isEmpty() || args.first() == "--help") {
        println("These are SVCS commands:")
        HELP_MAP.forEach { (command, description) ->
            println("$command${" ".repeat(MAX_SPACE - command.length)}$description")
        }
    } else {
        println(HELP_MAP.getOrDefault(args.first(), "'${args.first()}' is not a SVCS command."))
    }
}