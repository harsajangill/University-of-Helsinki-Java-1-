import java.util.ArrayList;
import java.util.Collections;

public class Grade {
    private ArrayList<Integer> grades;

    public Grade(){
        this.grades = new ArrayList<>();
    }

    public void add(int number){
        if (number >= 0 && number <= 100){
            this.grades.add(number);
        }
    }

    public double pointAverage(){
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }

        double average = (double) sum / this.grades.size();

        return average;
    }

    public double passingPointAverage(){
        int sum = 0;
        int total = 0;

        for (int grade : this.grades){
            if(grade >= 50) {
                sum += grade;
                total++;
            }
        }

        if (total == 0) {
            return -1;
        }
        
        double average = (double) sum / total;
        return average;
        
    }

    public double passPercentage(){
        int totalPassing = 0;
        for (int grade : this.grades){
            if (grade >= 50){
                totalPassing++;
            }
        }

        double passPercent = (double) 100 * totalPassing/this.grades.size();
        return passPercent;
    }

    public void gradeDistribution(){
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for (int j = 0; j < this.grades.size(); j++){
                if (i == 5){
                    if (this.grades.get(j) >= 90){
                        System.out.print("*");
                    }
                }

                if (i == 4){
                    if(this.grades.get(j) >= 80 && this.grades.get(j) < 90) {
                        System.out.print("*");
                    }
                }

                if (i == 3){
                    if(this.grades.get(j) >= 70  && this.grades.get(j) < 80) {
                        System.out.print("*");
                    }
                }

                if (i == 2){
                    if(this.grades.get(j) >= 60  && this.grades.get(j) < 70) {
                        System.out.print("*");
                    }
                }

                if (i == 1){
                    if(this.grades.get(j) >= 50 && this.grades.get(j) < 60) {
                        System.out.print("*");
                    }
                }

                if (i == 0){
                    if(this.grades.get(j) < 50) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }
    }
}
