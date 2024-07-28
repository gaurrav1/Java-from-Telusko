package Interface;
enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);
    private int price;

    private Laptop() {
        // default constructor for Laptop without prices
        price = 500;
        System.out.println("I am a default constructor in " + this + " with price " + price);
    } 


    private Laptop(int price) {
        this.price = price;
        System.out.println("I am a parameterized constructor in " + this + " with price " + price);
    }
    // Laptop is a class with 4 objects Macbook, XPS, Surface, ThinkPad

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {
        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " "  + lap.getPrice());
        }
       
    }
}
