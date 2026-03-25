package _0325_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionVsStream {
    public static void main(String[] args) {
        List<Car> cars = generateRandomCars(1_000, 1_000, 100_000, 313);
        
        // imperative approach
        int totalPrices = 0;
        for(Car c : cars) {
            totalPrices += c.getPrice();
        }
        System.out.println(totalPrices);

        // declarative approach
        System.out.println(cars.stream().mapToInt(Car::getPrice).sum());
    }

    public static List<Car> generateRandomCars(int num, int minPrice, int maxPrice, int seed) {
        Random r = new Random(seed);
        List<Car> cars = new ArrayList<>();

        for(int i=0; i<10_000; i++) {
            cars.add(new Car(r.nextInt(minPrice, maxPrice)));
        }

        return cars;
    }
}
