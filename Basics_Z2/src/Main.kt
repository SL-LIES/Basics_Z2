fun main() {
    println("Введите строку: ")
    val text = readln().uppercase()
    println("Ваша строка: ${text}")
    val eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var new_text = ""

    for (i in 0 until eng.length) {
        var count = 0
        for (j in 0 until text.length) {
            if (eng[i] == text[j]) {
                count += 1
            }
        }
        if (count > 0) {
            new_text += "${eng[i]}$count"
        }
    }
    println(new_text)
}