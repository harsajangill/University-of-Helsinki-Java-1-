import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private Grade grade;

    public UserInterface(Grade grade,Scanner scanner){
        this.scan = scanner;
        this.grade = grade;
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int input = Integer.valueOf(this.scan.nextLine());

            if (input == -1){
                System.out.println("Point average (all): " + this.grade.pointAverage());
                if (this.grade.passingPointAverage() != -1){
                    System.out.println("Point average (passing): " + this.grade.passingPointAverage());
                } else {
                    System.out.println("Point average (passing): -");
                }
                
                System.out.println("Pass percentage: " + this.grade.passPercentage());

                this.grade.gradeDistribution();
                break;
            }

            if (input >= 0 && input <= 100){
                this.grade.add(input);
                continue;
            }

        }


    }

}
