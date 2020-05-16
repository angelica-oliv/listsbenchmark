package com.angelicao.lists

import org.junit.Assert.assertEquals
import org.junit.Test


class JavaListsTest {
    private val javaList = JavaLists(TODO_LIST)

    @Test
    fun getDoneItemOrderedTitle_returnOrderedListWithDoneItems() {
        val orderedItems = javaList.doneItemOrderedTitle

        assertEquals(EXPECTED_DONE_TODO_LIST_ORDERED.size, orderedItems.size)
        assertEquals(EXPECTED_DONE_TODO_LIST_ORDERED[0], orderedItems[0])
        assertEquals(EXPECTED_DONE_TODO_LIST_ORDERED[1], orderedItems[1])
        assertEquals(EXPECTED_DONE_TODO_LIST_ORDERED[2], orderedItems[2])
    }
}