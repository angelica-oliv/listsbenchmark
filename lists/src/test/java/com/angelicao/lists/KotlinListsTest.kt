package com.angelicao.lists

import org.junit.Assert.assertEquals
import org.junit.Test


class KotlinListsTest {
    private val kotlinList = KotlinLists(TODO_LIST)

    @Test
    fun getDoneItemOrderedTitle_returnOrderedListWithDoneItems() {
        val orderedItems = kotlinList.getDoneItemOrderedTitle()

        assertEquals(EXPECTED_DONE_TODO_LIST_ORDERED.size, orderedItems.size)
        assertEquals(EXPECTED_DONE_TODO_LIST_ORDERED[0], orderedItems[0])
        assertEquals(EXPECTED_DONE_TODO_LIST_ORDERED[1], orderedItems[1])
        assertEquals(EXPECTED_DONE_TODO_LIST_ORDERED[2], orderedItems[2])
    }
}