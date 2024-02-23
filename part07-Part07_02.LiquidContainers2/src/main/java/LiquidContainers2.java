
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();


        while (true) {
            System.out.println("First: " + containerOne.toString());
            System.out.println("Second: " + containerTwo.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int value = Integer.valueOf(parts[1]);

            if(parts[0].equals("add")){
                containerOne.add(value);
            }

            if(parts[0].equals("remove")){
                containerTwo.remove(value);
            }

            if(parts[0].equals("move")){
                if(value > containerOne.contains()){
                    containerTwo.add(containerOne.contains());
                }

                if(value <= containerOne.contains()) {
                    containerTwo.add(value);
                }
                containerOne.remove(value);
                
            }
        }
    }

}
