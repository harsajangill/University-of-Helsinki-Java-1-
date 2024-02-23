import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                System.out.println("");
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            library.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            for (Book item : library) {
                System.out.println(item.toString());
            }
        } else if (input.equals("name")) {
            for (Book item : library) {
                System.out.println(item.getName());
            }
        }
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
