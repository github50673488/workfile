fun main() {
    var lists = listOf("卵を買う", "米を買う", "コンドムを買う", "アイス")
    for ((i, e) in lists.withIndex()) {
        println("$i $e")
    }
}
