package _0325_streams;

public class Car {
    private static int sn = 1;
    private String id;
    private int price;

    public Car(int price) {
        this.id = ""+sn++;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
