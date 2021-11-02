import java.util.Arrays;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        int capacity = 10;
        int size = 0;
        String[] todos = new String[capacity];
        Scanner scanner = new Scanner(System.in);
        do {


            System.out.println("1.Add to do\n2.Show all\n3.Exit");

            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Enter your task.");
                    scanner.nextLine();
                    todos[size++] = scanner.nextLine();

                }

                case 2 -> {
                    System.out.println(Arrays.toString(todos));
                }
                default -> {
                    return;
                }
            }


        }while (true) ;
    }
}
