package com.angelicao.lists

import com.angelicao.model.TodoItem


class KotlinLists(private val todoItemList: List<TodoItem>) {

    fun getDoneItemOrderedTitle(): List<TodoItem> =
        todoItemList.filter { it.done }
            .sortedBy { it.name }
}