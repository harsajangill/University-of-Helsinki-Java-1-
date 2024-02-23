
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // created an empty list
        ArrayList<Integer> list = new ArrayList<>();

        // loop that will insert user-input-values until -1
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                list.add(input);
                break;
            }

            list.add(input);
        }

        double sum = 0.0;
        for (int number : list) {
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);
        double average = sum/ (double) (list.size() -1);
        System.out.println("Average: " + average);
        
    }
}
