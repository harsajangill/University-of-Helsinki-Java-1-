
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment compared){
        int difference = (this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares);
        if (difference < 0) {
            return difference * -1;
        }

        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int houseOne = this.pricePerSquare * this.squares;
        int houseTwo = compared.pricePerSquare * compared.squares;
        if (houseOne > houseTwo) {
            return true;
        }

        return false;
    }

}
