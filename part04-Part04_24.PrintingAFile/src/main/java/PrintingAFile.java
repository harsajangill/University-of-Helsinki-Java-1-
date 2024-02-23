
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            while(scanner.hasNextLine()) {
                //read one line
                String row = scanner.nextLine();
                //print one line
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
