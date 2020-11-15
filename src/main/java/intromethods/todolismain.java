package intromethods;
import java.util.Arrays;

public class todolismain
{
    public static void main(String[] args)
    {
        TodoList todoList = new TodoList();

        todoList.addTodo("gardening");
        todoList.addTodo("practise yoga");
        todoList.addTodo("work");
        todoList.addTodo("cook");
        todoList.addTodo("read");

        System.out.println(todoList);

        todoList.finishTodos("work");

        System.out.println(todoList);

        todoList.finishAllTodos(Arrays.asList("practise yoga", "gardening"));

        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());

    }
}

