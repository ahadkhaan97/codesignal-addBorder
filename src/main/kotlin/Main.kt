fun main() {
    print(solution(mutableListOf("abc", "ded")))
}

fun solution(picture: MutableList<String>): MutableList<String> {
    var tempString = ""
    for (i in 0 until picture[0].length + 2) {
        tempString += "*"
    }
    picture.add(0, tempString)

    for (i in 1 until picture.size) {
        picture[i] = "*${picture[i]}*"
    }

    picture.add(tempString)

    return picture
}