package Drago;

public class Coordinates {
    public int x;
    public long y;
    public static int min_x = -835;
    public static long min_y = (long) -128;

    public Coordinates( int x, long y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public long getY()
    {
        return y;
    }


    public String toString() {
        return "X:" + x + " Y:" + y;
    }




    }
