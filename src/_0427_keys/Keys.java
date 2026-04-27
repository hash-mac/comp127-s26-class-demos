package _0427_keys;

import java.util.Set;
import java.awt.Dimension;
import java.awt.Toolkit;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Rectangle;
import edu.macalester.graphics.events.Key;

public class Keys {
    private static final int DELTA = 3;

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth()/2;
        int height = (int) screenSize.getHeight()/2;
        CanvasWindow cw = new CanvasWindow("Test Keys", width, height);
        Rectangle rec = new Rectangle(0, 0, 20, 30);
        rec.setCenter(cw.getHeight()/2, cw.getWidth()/2);
        cw.add(rec);

        cw.animate(e -> {
            Set<Key> keys = cw.getKeysPressed();
            if(keys.contains(Key.UP_ARROW)) {
                rec.moveBy(0, -DELTA);
            }

            if(keys.contains(Key.DOWN_ARROW)) {
                rec.moveBy(0, DELTA);
            }

            if(keys.contains(Key.LEFT_ARROW)) {
                rec.moveBy(-DELTA, 0);
            }

            if(keys.contains(Key.RIGHT_ARROW)) {
                rec.moveBy(DELTA, 0);
            }
        });
    }
}
