package _0213_classes_and_objects_from_inside.sec01;

public class Toaster {
    private boolean isPlugged;
    int currTemp; // change this to private
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

    public void increaseTemp() {
        if(!isPlugged) return;

        currTemp = Math.min(maxTemp, ++currTemp);
    }

    public void decreaseTemp() {
        if(!isPlugged) return;

        currTemp = Math.max(0, --currTemp);
    }

    private void setTemp(int newTemp) {
        currTemp = newTemp;
    }

    public int getCurrTemp() {
        return currTemp;
    }
}

class ToasterTester {
    public static void main(String[] args) {
        Toaster t = new Toaster(10);
        // t.plug();
        t.increaseTemp();
        t.currTemp = 100;
        System.out.println(t.getCurrTemp());
    }
}