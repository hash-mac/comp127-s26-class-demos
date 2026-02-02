package _0202_unit_tests;

import java.util.ArrayList;
import java.util.List;

public class Scope {
    public static void main(String[] args) {
        ArrayList<String> ws;
        ws = new ArrayList<>(List.of("A", "B"));

        for(String w : ws) {
            System.out.println(w);
        }

        {
            int x = 10;
            {
                int y = 20;
            }
        }

        int y = 10;
    }
}
