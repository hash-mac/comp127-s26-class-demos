package _0204_refactoring;

public class Kahoot {
    public static void print() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        // while (true) {print();}

        while(true) {print(); break;}
        
        // while(true) {break; print();}
        
        // while(true) {continue; print();}

        // while(true) {print(); continue;}

        for(int i=0; i<1; i--) {print();}

        for(int i=0; i<1; i++) {print();}
    }
}
