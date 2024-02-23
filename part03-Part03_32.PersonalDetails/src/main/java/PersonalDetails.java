
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        double sum = 0.0;
        int size = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");

            if (pieces[0].length() > name.length()) {
                name = pieces[0];
            }

            sum += Double.valueOf(pieces[1]);
            size++;
        }

        double average = sum/(double) size;

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);


    }
}
