package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(String caption)
    {
        Todo todo = new Todo(caption); // true vagy false-al tér vissza
        todos.add(todo);
    }

    public void finishTodos(String caption)
    {
        for (Todo todo: todos)
        {
            if (todo.getCaption().equals(caption)) // ha igaz ez
            {
                todo.finish(); // ha belelép akkor tru értékkel tér vissza
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish)
    {
        for (String todoToFinish: todosToFinish)
        {
            finishTodos(todoToFinish);  // össze hasonlitja
        }
    }

    public List<String> todosToFinish()
    {
        List<String> todosToFinish = new ArrayList<>();
        for (Todo todo: todos)
        {
            if (!todo.isFinished()) // ha  false
            {
                todosToFinish.add(todo.getCaption()); // igaz vagy hamis

            }
        }
        return todosToFinish; // vissza adja a végereményt
    }

    public int numberOfFinishedTodos()
    {
        int sum = 0;
        for (Todo todo: todos)
        {
            if (todo.isFinished())   // true vagy false
            {
                sum++; // +1-el növeli
            }
        }
        return sum;  // vissza adja a sum értéket mennyi darab
    }

    @Override
    public String toString()
    {
        return todos.toString();
    }
}


