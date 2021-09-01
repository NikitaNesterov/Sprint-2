class ProblemD {

    fun main() {

        val requestQuantity = readInt()

        for (i in 1..requestQuantity) {
            val clientsQuantity = readInt()
            var moneyInUse = readListLong().sorted()

            var maxProfit = 0L
            for (k in 0 until clientsQuantity) {
                val profitToCompare = moneyInUse[k] * (clientsQuantity - k)
                if (profitToCompare > maxProfit) {
                    maxProfit = profitToCompare
                }
            }
            println(maxProfit)
        }
    }
}