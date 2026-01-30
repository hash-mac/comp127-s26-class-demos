package _0130_abstraction_method_calls;

public class CompareStrings {
    public static void main(String[] args) {
        // java tries to save you some memory
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        // ... but not in this case!
        String s3 = "Hello";
        String s4 = "Hell";
        s4 += 'o';
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
