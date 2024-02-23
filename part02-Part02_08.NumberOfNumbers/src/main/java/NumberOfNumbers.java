
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = 0;
        
        while (true) {
            System.out.println("Give a number:");


            int input = Integer.valueOf(scanner.nextLine());


            if (input == 0) {
                System.out.println("Number of numbers: " + times );
                break;
            }

            if (input != 0) {
                times = times + 1;
                continue;
            }


        }
    }
}
