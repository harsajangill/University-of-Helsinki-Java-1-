
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int times = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            sum = sum + number;
            times = times + 1;
        }

        if (times == 0) {
            System.out.println("Cannot calcualte the average");
        } else {
            double average = sum/times;
            System.out.println(average);
        }
    }

}