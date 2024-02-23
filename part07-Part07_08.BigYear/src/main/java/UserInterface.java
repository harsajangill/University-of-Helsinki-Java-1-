import java.util.Scanner;

public class UserInterface {
    private BirdDatabase bd;
    private Scanner scanner;

    public UserInterface(Scanner scanner, BirdDatabase bd){
        this.scanner = scanner;
        this.bd = bd;
    }

    public void start(){

        while(true){
            System.out.print("? ");
            String input = scanner.nextLine();

            if (input.equals("Quit")){
                break;
            }

            if (input.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                this.bd.addBird(name, latinName);
                continue;
            }

            if (input.equals("Observation")){
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                this.bd.addObservation(name);
                continue;
            }

            if (input.equals("All")){
                this.bd.printAllBirds();
                continue;
            }

            if (input.equals("One")){
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                this.bd.printOneBird(name);
            }
        }
    }
}
