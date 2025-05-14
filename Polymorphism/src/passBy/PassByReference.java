package passBy;

import java.util.StringJoiner;

public class PassByReference {
    public static void main(String[] args) {
        Point point = new Point(5,6);
        System.out.println(point);
        move(point);
        System.out.println(point);
    }
    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }
    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
