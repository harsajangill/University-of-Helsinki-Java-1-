public class Product {
    // variables
    private double price;
    private int quantity;
    private String name;

    // constructor
    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    //methods
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs" );
    }


}
