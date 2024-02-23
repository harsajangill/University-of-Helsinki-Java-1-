public class item {

    private String identifier;
    private String name;

    public item(String id, String name) {
        this.identifier = id;
        this.name = name;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof item)){
            return false;
        }

        item comparedItem = (item) compared;

        if (this.identifier == comparedItem.identifier) {
            return false;
        }

        return (this.identifier.equals(comparedItem.identifier) && this.name.equals(comparedItem.name));

    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.identifier + ": " + this.name;
    }

}
