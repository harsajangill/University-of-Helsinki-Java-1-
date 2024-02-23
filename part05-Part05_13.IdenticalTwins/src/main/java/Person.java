
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects

    public boolean equals(Object compared) {

        //if variables in same location
        if (this == compared) {
            return true;
        }

        //if the type of compared object is not Person
        if (!(compared instanceof Person)) {
            return false;
        }

        //convert object to Person
        Person comparedPerson = (Person) compared;

        // check if values of both Person variables are the same
        if(this.name.equals(comparedPerson.name) && this.birthday.equals(comparedPerson.birthday) && this.height == comparedPerson.height && this.weight == comparedPerson.weight) {
            return true;
        }
        
        return false;
    }
}