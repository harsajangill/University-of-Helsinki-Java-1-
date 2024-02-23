import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;


    public Suitcase(int maxWeight){
        this.suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        int currentWeight = 0;
        for (Item per : this.suitcase){
            currentWeight += per.getWeight();
        }

        if ((currentWeight + item.getWeight()) <= this.maxWeight) {
            this.suitcase.add(item);
        }
    }

    public String toString(){

        if(this.suitcase.size() == 0){
            return "no items (0 kg)";
        }

        int currentWeight = 0;
        for (Item per : this.suitcase){
            currentWeight += per.getWeight();
        }

        if(this.suitcase.size() == 1) {
            return this.suitcase.size() + " item (" + currentWeight + " kg)";
        }
        return this.suitcase.size() + " items (" + currentWeight + " kg)";
    }

    public void printItems(){
        for (Item item : this.suitcase) {
            System.out.println(item);
        }
    }

    public int totalWeight(){
        int currentWeight = 0;
        for (Item per : this.suitcase){
            currentWeight += per.getWeight();
        }

        return currentWeight;
    }

    public Item heaviestItem(){

        if (this.suitcase.size() == 0){
            return null;
        }
        
        Item returnObject = this.suitcase.get(0);

        for (Item item : this.suitcase){
            if(returnObject.getWeight() < item.getWeight()) {
                returnObject = item;
            }
        }

        return returnObject;
    }




}


