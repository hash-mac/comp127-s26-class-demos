package _0204_refactoring;

import java.util.List;

public class ForEachTrace {
    public static void main(String[] args) {
        List<String> lst = List.of("One", "Two", "Three");
        for (String i : lst) {
            System.out.println(i);
        }
    }
}
