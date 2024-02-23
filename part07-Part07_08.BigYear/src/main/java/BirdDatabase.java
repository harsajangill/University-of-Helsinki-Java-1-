import java.util.ArrayList;;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase(){
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName){
        Bird newBird = new Bird(name, latinName);
        this.birds.add(newBird);
    }

    public void addObservation(String birdName){
        for(Bird bird : this.birds){
            if(bird.getName().equals(birdName)){
                bird.addObservation();
                break;
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public void printAllBirds(){
        for(Bird bird : this.birds){
            System.out.println(bird.toString());
        }
    }

    public void printOneBird(String name){
        for(Bird bird : this.birds){
            if(bird.getName().equals(name)){
                System.out.println(bird.toString());
                break;
            }
        }
    }


}
