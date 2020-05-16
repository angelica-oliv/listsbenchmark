package com.angelicao.compare

val SMALL_LIST = (0..2)
val SMALL_SEQUENCE = SMALL_LIST.asSequence()

fun getFirstFromList(list: IntRange) {
    list
        .map { println("map $it"); it * 5 }
        .filter { println("filter $it"); it % 2 == 0 }
        .take(1)
        .forEach { println("list $it") }
}

fun getFirstFromSequence(sequence: Sequence<Int>) {
    sequence
        .map { println("map $it"); it * 5 }
        .filter { println("filter $it"); it % 2 == 0 }
        .take(1)
        .forEach { println("sequence $it") }
}

fun main() {
    getFirstFromList(SMALL_LIST)
    getFirstFromSequence(SMALL_SEQUENCE)
}