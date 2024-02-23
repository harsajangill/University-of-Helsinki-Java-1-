import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan){
        this.list = list;
        this.scan = scan;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = scan.nextLine();

            if(input.equals("stop")){
                break;
            }

            if (input.equals("add")){
                System.out.print("To add: ");
                String add = scan.nextLine();
                this.list.add(add);
            }

            if(input.equals("list")){
                this.list.print();
            }

            if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scan.nextLine());
                this.list.remove(number);
            }
        }
    }

}
