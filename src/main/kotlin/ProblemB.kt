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

            var stringToBuild = mutableListOf<String>()

            for (k in 1..frequency) {
                for (i in 0..symbolsQuantity - 1) {
                    stringToBuild.add('a'.plus(i).toString())
                }
            }

            for (count in 1..divisionReminder) {
                stringToBuild.add('a'.plus((Math.random() * symbolsQuantity).roundToInt()).toString())
            }

            requestResults.add(buildString {
                for (item in stringToBuild.shuffled()) {
                    append(item)
                }
            })
        }
        requestResults.forEach { println(it) }
    }
}