import java.io.*;
import java.util.*;

public class ToDoList {
    private static final String FILE_NAME = "todo.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. View To-Do List");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Clear All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewTasks();
                    break;
                case 2:
                    System.out.print("Enter a task to add: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case 3:
                    System.out.print("Enter the task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    removeTask(taskNumber);
                    break;
                case 4:
                    clearTasks();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting To-Do List. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }