import becker.robots.*;

public class BagofThings
{
    public static void main(String[] args) {

        City dc = new City();

        Robot karel = new Robot(dc, 0, 0, Direction.SOUTH, 1);
        Robot carl = new Robot(dc,0,3, Direction.EAST, 0);

        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        carl.pickThing();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
        carl.turnLeft();
        


    }
}
