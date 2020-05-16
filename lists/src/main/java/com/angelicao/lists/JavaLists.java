package com.angelicao.lists;

import com.angelicao.model.TodoItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class JavaLists {
    private List<TodoItem> todoItemList;
    public JavaLists(List<TodoItem> todoItemList) {
        this.todoItemList = todoItemList;
    }

    List<TodoItem> getDoneItemOrderedTitle() {
        List<TodoItem> resultList = new ArrayList<>();

        for(TodoItem todoItem: todoItemList) {
            if(todoItem.getDone()) {
                resultList.add(todoItem);
            }
        }

        Collections.sort(resultList, new Comparator<TodoItem>() {
            @Override
            public int compare(TodoItem todoItem1, TodoItem todoItem2) {
                return todoItem1.getName().compareTo(todoItem2.getName());
            }
        });

        return resultList;
    }
}
