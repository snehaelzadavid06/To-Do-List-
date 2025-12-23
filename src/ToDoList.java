import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do
        {
            System.out.println("\n\tTO-DO LIST\t\n Stay organized, stay productive. One task at a time.");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                        System.out.print("Enter task: ");
                        String task = sc.nextLine();
                        tasks.add(task);
                        System.out.println("Task added successfully!");
                        break;

                case 2:
                       System.out.println("\nYour Tasks: ");
                       if (tasks.isEmpty())
                          System.out.println("No tasks added yet.");
                       else
                       {
                         for (int i = 0; i < tasks.size(); i++)
                         {
                             System.out.println((i + 1) + ". " + tasks.get(i));
                         }
                       }
                       break;

                case 3:
                      System.out.println("Exiting To-Do List. Tataaa;)");
                      break;

                default: System.out.println("Invalid choice. Please try again.");
            }
        }while(choice != 3);
        sc.close();
    }
}
