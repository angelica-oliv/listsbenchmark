package com.angelicao.lists

import com.angelicao.model.TodoItem

val TODO_LIST = listOf(
    TodoItem(
        id = 1,
        name = "Todo 1",
        description = "description 1",
        done = true),
    TodoItem(
        id = 4,
        name = "Todo 4",
        description = "description 4",
        done = true),
    TodoItem(
        id = 2,
        name = "Todo 2",
        description = "description 2",
        done = false),
    TodoItem(
        id = 3,
        name = "Todo 3",
        description = "description 3",
        done = true)
)

val EXPECTED_DONE_TODO_LIST_ORDERED = listOf(
    TodoItem(
        id = 1,
        name = "Todo 1",
        description = "description 1",
        done = true),
    TodoItem(
        id = 3,
        name = "Todo 3",
        description = "description 3",
        done = true),
    TodoItem(
        id = 4,
        name = "Todo 4",
        description = "description 4",
        done = true)
)