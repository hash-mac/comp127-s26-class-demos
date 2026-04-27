package _0427_keys;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Rectangle;

public class Keys {
    public static void main(String[] args) {
        CanvasWindow cw = new CanvasWindow("Test Keys", 500, 500);
        Rectangle rec = new Rectangle(0, 0, 20, 30);
        rec.setCenter(cw.getHeight()/2, cw.getWidth()/2);
        cw.add(rec);

        cw.animate(e -> {
            Set keys = cw.getKeysPressed();
        });
    }
}
