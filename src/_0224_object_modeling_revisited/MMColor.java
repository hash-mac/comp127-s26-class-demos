package _0224_object_modeling_revisited;

import java.util.Random;

public enum MMColor {
    r, g, b, y, p, o;

    private static final MMColor[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static MMColor getRanMmColor() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
