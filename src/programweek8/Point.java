package programweek8;

public class Point {


        int x;
        int y;

        //zero arg constructor
        public Point() {

        }

        // constructor with two params
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //create getX() method to return x
        public int getX() {
            return x;
        }
        //create getY() method to return y
        public int getY() {
            return y;
        }

        //create setX method to set x value
        public void setX(int x) {
            this.x = x;

        }
        //create setY method to set y value
        public void setY(int y) {
            this.y = y;
        }

        //create distance() method to return 0,0 value
        public double distance() {
            return distance(0, 0);
        }

        //create distance() method to return distance value
        public double distance(int x, int y) {
            return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        }

        public double distance(Point another) {
            return distance(another.x, another.y);
        }

        //declare main method
        public static void main(String[] args) {
            Point first = new Point(6, 5);
            Point second = new Point(3, 1);
            System.out.println("distance(0,0)= " + first.distance());
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2, 2));
            Point point = new Point();
            System.out.println("distance()= " + point.distance());
        }
    }










