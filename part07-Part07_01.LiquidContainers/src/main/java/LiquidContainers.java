
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts[0].equals("add")){
                if (Integer.valueOf(parts[1]) < 0){
                    continue;
                }

                if((Integer.valueOf(parts[1]) + containerOne) > 100) {
                    containerOne = 100;
                    continue;
                }

                containerOne += Integer.valueOf(parts[1]);
                
                continue;
            }

            if (parts[0].equals("move")){

                if(Integer.valueOf(parts[1]) < 0){
                    
                    continue;
                }

                if(Integer.valueOf(parts[1]) >= containerOne) {
                    containerTwo += containerOne;
                    containerOne = 0;
                }

                if(Integer.valueOf(parts[1]) < containerOne) {
                    containerTwo += Integer.valueOf(parts[1]);
                    containerOne -= Integer.valueOf(parts[1]);
                }

                if(containerTwo > 100){
                    containerTwo = 100;
                }

                
                continue;

            }

            if(parts[0].equals("remove")){
                if(Integer.valueOf(parts[1]) < 0) {
                    
                    continue;
                }

                if(Integer.valueOf(parts[1]) >= containerTwo){
                    containerTwo = 0;
                    
                    continue;
                }

                containerTwo -= Integer.valueOf(parts[1]);

            }
        }
    }

}
