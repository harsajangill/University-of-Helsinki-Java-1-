
public class HealthStation {
    private int patientsWeighed;

    public HealthStation(){
        this.patientsWeighed = 0;
    }

    public int weigh(Person person) {
        this.patientsWeighed++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return this.patientsWeighed;
    }


}