package _0401_breakout;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.TextAlignment;
import edu.macalester.graphics.events.Key;
import edu.macalester.graphics.events.ModifierKey;

public class Timer {
    private static int counter  = 0;
    private static double textSize = 50;

    public static void main(String[] args) {
        CanvasWindow cw = new CanvasWindow("Timer", 500, 500);

        GraphicsText timeGT = new GraphicsText("0");
        timeGT.setFontSize(textSize);
        timeGT.setCenter(cw.getWidth()/2, cw.getHeight()/2);
        timeGT.setAlignment(TextAlignment.CENTER);
        cw.add(timeGT);
        
        cw.animate(() -> {
            counter++;
            timeGT.setText(String.format("%.1f", counter/60.0));
        });

        cw.onClick(e -> {
            timeGT.setCenter(e.getPosition());
        });

        cw.onKeyDown(e -> {
            if(e.getModifiers().contains(ModifierKey.CONTROL)) {
                if(e.getKey() == Key.UP_ARROW) {
                    timeGT.setFontSize(++textSize);
                }
                if(e.getKey() == Key.DOWN_ARROW) {
                    timeGT.setFontSize(--textSize);
                }
            }
            else {
                if(e.getKey() == Key.UP_ARROW) {
                    timeGT.setCenter(timeGT.getCenter().add(new Point(0, -1)));
                }
                if(e.getKey() == Key.DOWN_ARROW) {
                    timeGT.setCenter(timeGT.getCenter().add(new Point(0, 1)));
                }
                if(e.getKey() == Key.LEFT_ARROW) {
                    timeGT.setCenter(timeGT.getCenter().add(new Point(-1, 0)));
                }
                if(e.getKey() == Key.RIGHT_ARROW) {
                    timeGT.setCenter(timeGT.getCenter().add(new Point(1, 0)));
                }
            }
        });
    }
}
