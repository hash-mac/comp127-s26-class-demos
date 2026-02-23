package _0223_inheritance;

public class Override02 {
    public static void main(String[] args) {
        P p = new C();
        // p.do2();  // causes compile error.  WHY?
    }
}

class P {
    public void do1() {}
}

class C extends P {
    public void do1() {}
    public void do2() {}
}
