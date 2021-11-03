import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
DynamicArray todos = new DynamicArray();
        Scanner scanner = new Scanner(System.in);
        do {


            System.out.println("1.Add to do\n2.Show all\n3.Exit");

            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Enter your task.");
                    scanner.nextLine();


                    todos.add(scanner.nextLine());

                }

                case 2 -> {
                    System.out.println(todos);
                }
                default -> {
                    return;
                }
            }


        }while (true) ;
    }
}
