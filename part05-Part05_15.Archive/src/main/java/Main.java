
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<item> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if(identifier.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            item newItem = new item(identifier,name);

            boolean contains = false;
            for (item element : archive) {
                if (element.getIdentifier() == newItem.getIdentifier()) {
                    contains = true;
                    break;
                }
            }

            if (contains == false && !archive.contains(newItem)) {
                archive.add(newItem);
            }
        }

        System.out.println("==Items==");
        for (item element : archive) {
            System.out.println(element);
        }

    }
}
