
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String collection = "";
        if (this.elements.size() > 1) {
            for (String word: elements) {
                collection = collection + word + "\n";
            }
        } else{
            collection = this.elements.get(0);
        }

        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:\n" + collection;
        }

        return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + collection;

    }
    
}
 