public class Fitbyte {
    private int age;
    private int restingHeartRate;


    public Fitbyte(int age, int resting){
        this.age = age;
        this.restingHeartRate = resting;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxRate = 206.3 - (0.711 * this.age);
        return (maxRate - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
    }

}
