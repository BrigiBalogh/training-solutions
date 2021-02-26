package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {


    private List<Todo> todos = new ArrayList<>();

    public int getNumberOfItemsLeft() {
        int count = 0;
        for (Todo todo : todos) {
            if (todo.getState().equals(State.NON_COMPLETED)) {
                count++;
            }
        }
        return count;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public List<String> getMostImportantTodosText() {
        List<String> ret = new ArrayList<>();
        int max = Todo.MIN_PRIORITY;
        for (Todo todo : todos) {
            if (todo.getPriority() < max) {
                max = todo.getPriority();
            }
        }
        for (Todo todo : todos) {
            if (todo.getPriority() == max) {
                ret.add(todo.getText());
            }
        }
        return ret;
    }

    public void deleteCompleted() {
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }
}
