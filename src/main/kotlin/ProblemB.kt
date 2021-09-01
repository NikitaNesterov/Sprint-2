import kotlin.math.roundToInt

class ProblemB {

    fun main() {

        val requestResults = mutableListOf<String>()

        val requestQuantity = readInt()
        for (i in 1..requestQuantity) {

            val secondLine = readListInt()
            val lineLength = secondLine.get(0)
            val symbolsQuantity = secondLine.get(1)

            val divisionReminder = lineLength % symbolsQuantity
            val frequency = (lineLength - divisionReminder) / symbolsQuantity

            var wantedString = ""

            for (i in 0 until symbolsQuantity) {
                wantedString += ('a'.plus(i).toString().repeat(frequency))
            }

            for (count in 1..divisionReminder) {
                wantedString += ('a'.plus((Math.random() * symbolsQuantity).roundToInt()).toString())
            }

            requestResults.add(buildString {
                for (item in wantedString.toMutableList().shuffled()) {
                    append(item)
                }
            })
        }
        requestResults.forEach { println(it) }
    }
}





