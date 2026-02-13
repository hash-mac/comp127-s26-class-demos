package _0213_classes_and_objects_from_inside;

public class Toaster {
    private boolean isPluggd;
    private int currentTemp;

    public void setCurrentTemp(int currentTemp) {
        if(isPluggd) {
            this.currentTemp = currentTemp;
        }
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void plug() {
        isPluggd = true;
    }

    public void unPlug() {
        isPluggd = false;
    }
}
