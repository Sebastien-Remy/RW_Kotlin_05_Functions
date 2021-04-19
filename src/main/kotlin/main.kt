fun main(args: Array<String>) {
    println("Functions!")

    fun createRange(start: Int = 0, end: Int, isHalfOpen: Boolean = false): IntRange {
        return if (isHalfOpen) {
            start until end
        } else {
            start..end
        }
    }

    fun printRange(range: IntRange) {
        for (number in range) print("$number \t")
        println()
    }

    val closeRange = createRange(1, 10)
    printRange(closeRange)

    val halfOpenRange = createRange(1, 10, true)
    printRange(halfOpenRange)

    val usingArg = createRange(isHalfOpen = true, end = 10, start = 2)
    printRange(usingArg)

    printRange(createRange(end = 5))

}
