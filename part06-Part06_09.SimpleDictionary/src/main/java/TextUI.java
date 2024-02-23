import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }

            if(input.equals("add")){
                System.out.print("Word: ");
                String word = this.scanner.nextLine();

                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();

                this.dictionary.add(word, translation);

                continue;
            }

            if(input.equals("search")){
                System.out.print("To be translated: ");
                String translateWord = this.scanner.nextLine();

                if(this.dictionary.translate(translateWord) == null) {
                    System.out.println("Word " + translateWord + " was not found");
                    continue;
                }

                System.out.println(this.dictionary.translate(translateWord));
                continue;
            }

            System.out.println("Unknown command");
        }
    }

}
