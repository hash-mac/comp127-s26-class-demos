package _0128_syntax_asts_statictypes_operators_precedence;

public class FloatPointNumbers {
    public static void main(String[] args) {
        
        float sum = 0.0f;
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteraion #" + (i+1));

            sum += 0.1f;
            // the output appears correct when utilizing the standard precision settings
            System.out.printf("sum = %f%n", sum);

            // however, when the precision is increased, the actual representation becomes visible
            System.out.printf("sum = %-1.10f%n", sum);

            System.out.println();
        }
    }
}
