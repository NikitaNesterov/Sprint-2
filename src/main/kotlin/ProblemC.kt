class ProblemC {

    fun main() {

        val studentsQuantity = readInt()
        var studentsSkilss = readListInt().sorted()

        var commonSkillsToStudy = 0;
        var count =  0;

        while (count <= studentsSkilss.size - 1) {
            commonSkillsToStudy += studentsSkilss.get(count + 1) - studentsSkilss.get(count)
            count +=2
        }
        println(commonSkillsToStudy)
    }
}