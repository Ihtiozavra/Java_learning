package education01;

public class Lenght {

    public static void main (String[] Args) {
        Point p1 = new Point(2.0, 8.0);
        Point p2 = new Point(6.0, 5.0);

        System.out.println (Point.distance(p1, p2));
    }
}