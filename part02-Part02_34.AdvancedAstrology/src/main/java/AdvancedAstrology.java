
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the 
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i ++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        int j = 1;
        for ( int i = size-1; i >= 0 & j <= size; i--, j++) {
            printSpaces(i);
            printStars(j);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        int space = height - 1;
        int ast = 1;
        
        for ( int i = 0; i < height; i++ ) {
            printSpaces(space);
            printStars(ast);
            space --;
            ast +=2;
        }

        printSpaces( (((height*2)-1)/2)-1);
        printStars(3);
        printSpaces( (((height*2)-1)/2)-1);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        // printTriangle(5);
        // System.out.println("---");
        // christmasTree(4);
        // System.out.println("---");
        christmasTree(10);
    }
}
