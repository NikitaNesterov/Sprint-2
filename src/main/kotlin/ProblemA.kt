class ProblemA {

    fun main() {

        val requestQuantity = readInt()
        val positionList = ArrayList<Long>()

        for (i in 1..requestQuantity) {
            val requestsData = readListLong()
            var position: Long = 0
            var step = requestsData.get(2)

            var count = 0
            while (step > 0) {
                if (count == 0) {
                    position += requestsData[count]
                    step--
                    count++

                } else {
                    position -= requestsData[count]
                    step--
                    count--
                }
            }
            positionList.add(position)
        }

        for (k in positionList) {
            println(k)
        }
    }
}