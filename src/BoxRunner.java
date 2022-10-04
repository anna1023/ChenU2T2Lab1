public class BoxRunner {
    public static void main (String[] args){
        Box box1 = new Box(5.0, 4.5, 7.2);
        Box box2 = new Box(5, 4, 7);
        Box cube1 = new Box(15.0);
        Box cube2 = new Box(15);
        Box box3 = new Box(2.5, 6.7,2.2);
        Box box4 = new Box(1,2,4);
        Box newBox = new Box(6, 10, 8);


        boolean x = newBox.anySideLongerThan(5); // C


        newBox.printDimensions(); // F

        box4.printVolume();


    }
}
