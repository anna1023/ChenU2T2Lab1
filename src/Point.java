public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int both) {
        x = both;
        y = both;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int newX) {
        x = newX;
    }

    public int getY() {
        return y;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + "," + y + ")";
    }

    public String quadrant() {
        if (x == 0 && y == 0)
        {
            return ("The coordinate is on the origin.");
        }
        if (x==0 || y==0)
        {
            return("The coordinate is on an axis.");
        }
        if (x > 0 && y > 0)
        {
            return("The coordinate is in quadrant 1.");
        }
        if (x < 0 && y < 0)
        {
            return("The coordinate is in quadrant 3.");
        }
        if (x < 0 && y > 0)
        {
            return("The coordinate is in quadrant 2.");
        }
        if (x > 0 && y < 0)
        {
            return("The coordinate is in quadrant 4.");
        }
        return ("The coordinate is not on a graph.");
    }
}
