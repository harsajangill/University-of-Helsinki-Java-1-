import java.util.ArrayList;;

public class Room {
    ArrayList<Person> people;

    public Room(){
        this.people = new ArrayList<>();
    }

    public void add(Person person){
        this.people.add(person);
    }

    public boolean isEmpty(){
        return this.people.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.people;
    }

    public Person shortest(){
        if(this.people.isEmpty()) {
            return null;
        }

        Person returnObject = this.people.get(0);

        for(Person human : this.people){
            if(returnObject.getHeight() > human.getHeight()) {
                returnObject = human;
            }
        }

        return returnObject;
    }

    public Person take(){
        Person shortest = this.shortest();
        this.people.remove(shortest);
        return shortest;
    }

}
