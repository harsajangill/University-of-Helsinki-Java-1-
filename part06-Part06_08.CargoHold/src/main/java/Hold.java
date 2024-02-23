import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxLuggageWeight;

    public Hold(int maxWeight){
        this.maxLuggageWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentLuggageWeight = 0;
        for (Suitcase item : this.suitcases){
            currentLuggageWeight += item.totalWeight();
        }

        if ((currentLuggageWeight + suitcase.totalWeight()) <= maxLuggageWeight){
            this.suitcases.add(suitcase);
        }
    }

    public String toString(){
        int currentLuggageWeight = 0;
        for (Suitcase item : this.suitcases){
            currentLuggageWeight += item.totalWeight();
        }

        return suitcases.size() + " suitcases (" + currentLuggageWeight + " kg)";
    }

    public void printItems(){
        for (Suitcase suitcase : this.suitcases){
            suitcase.printItems();
        }
    }
    
}
