import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scan;

    public UserInterface(JokeManager manager, Scanner scan){
        this.manager = manager;
        this.scan = scan;
    }

    public void start(){

        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String input = scan.nextLine();

            if (input.equals("X")){
                break;
            }

            if(input.equals("1")){
                System.out.println("Write the joke to be added:");
                String addJoke = scan.nextLine();

                this.manager.addJoke(addJoke);
                continue;
            }

            if(input.equals("2")){
                System.out.println("Drawing a joke.");
                this.manager.drawJokes();
                continue;
            }

            if(input.equals("3")){
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
                continue;
            }
        }

    }

}
