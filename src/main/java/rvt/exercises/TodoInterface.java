package rvt.exercises;

import java.util.Scanner;

public class TodoInterface {
    private TodoList todoList;
    private Scanner scanner;

    public TodoInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                todoList.add(this.scanner.nextLine());
            }
            if (command.equals("list")) {
                this.todoList.print();
            }

        }
    }
}
