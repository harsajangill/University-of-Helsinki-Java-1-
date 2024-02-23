
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sum = 0;
        int times = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            sum = sum + number;
            times = times + 1;

        }

        double average = sum/times;
        System.out.println("Average of the numbers: " + average);
    }
}
