import java.util.ArrayList;

public class JokeManager {
    private ArrayList<String> list;

    public JokeManager(){
        this.list = new ArrayList<>();
    }

    public void addJoke(String joke){
        this.list.add(joke);
    }

    public String drawJokes(){
        if(this.list.isEmpty()){
            return "Jokes are in short supply.";
        }

        int index = (int) (Math.random() * this.list.size());
        return this.list.get(index);
    }

    public String drawJoke(){
        if(this.list.isEmpty()){
            return "Jokes are in short supply.";
        }

        int index = (int) (Math.random() * this.list.size());
        return this.list.get(index);
    }

    public void printJokes(){
        for(String joke : this.list){
            System.out.println(joke);
        }
    }
}
