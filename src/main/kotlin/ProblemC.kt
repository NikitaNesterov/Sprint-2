class ProblemC {

    fun main() {

        val studentsQuantity = readInt()
        var studentsSkilss = readListInt().sorted()

        var commonSkillsToStudy = 0;

        for (i in 0 until studentsSkilss.size - 1 step 2) {
            commonSkillsToStudy += studentsSkilss.get(i + 1) - studentsSkilss.get(i)
        }
        println(commonSkillsToStudy)
    }
}