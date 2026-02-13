package _0213_classes_and_objects_from_inside.sec02;

public class Toaster {
    private boolean isPlugged;
    int currTemp;
    final int maxTemp;

    public Toaster(int maxTemp) {
        this.maxTemp = maxTemp;
        isPlugged = false;
        currTemp = 0;
    }

    public void plug() {
        isPlugged = true;
    }

    public void unplug() {
        isPlugged = false;
    }

    public void increseTemp() {
        if(!isPlugged) return;

        currTemp = Math.min(maxTemp, ++currTemp);
    }

    public void decreaseTemp() {
        if(!isPlugged) return;

        currTemp = Math.max(0, --currTemp);
    }

    private void setCurrTemp(int currTemp) {
        this.currTemp = currTemp;
    }

    public int getCurrTemp() {
        return currTemp;
    }
}

class ToasterTest {
    public static void main(String[] args) {
        Toaster t = new Toaster(10);
        t.plug();
        t.increseTemp();
        t.currTemp = 1000;
        System.out.println(t.getCurrTemp());
    }
}
