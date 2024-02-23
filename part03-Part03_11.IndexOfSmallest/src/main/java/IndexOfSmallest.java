
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                list.add(input);
                break;
            }
            list.add(input);
        }
        
       int number = 9999;
        // finding smallest number in list
       for (int i = 0; i <= list.size()-1; i++) {
            if (number > list.get(i)) {
             number = list.get(i);
            } else {
                 continue;
            }
       }

       System.out.println("Smallest number: " + number);

       for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i) == number) {
                System.out.println("Found at index: " + i);
            }
       }

        
    }
}
