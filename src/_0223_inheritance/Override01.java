package _0223_inheritance;

public class Override01 {
    public static void main(String[] args) {
        P p = new C();
        p.do1();
    }
}

class P {
    public void do1() {
        System.out.println("P-do1");
        do2();
    }

    public void do2() {
        System.out.println("P-do2");
    }
}

class C extends P {
    public void do1() {
        super.do1();
        System.out.println("C-do1");
    }

    public void do2() {
        System.out.println("C-do2");
    }
}