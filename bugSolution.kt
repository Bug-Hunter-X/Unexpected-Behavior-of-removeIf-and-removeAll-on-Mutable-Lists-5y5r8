fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    list.forEach { if (it % 2 == 0) toRemove.add(it) }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    val toRemove2 = mutableListOf<Int>()
    list2.forEach { if (it % 2 == 0) toRemove2.add(it) }
    list2.removeAll(toRemove2)
    println(list2) // Output: [1, 3, 5]
} 