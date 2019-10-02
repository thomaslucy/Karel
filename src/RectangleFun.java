import java.awt.*;
import java.util.Scanner;

public class RectangleFun
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Width: ");
        int width = scan.nextInt();
        System.out.println("Length: ");
        int length = scan.nextInt();
        System.out.println("X: ");
        int x = scan.nextInt();
        System.out.println("Y: ");
        int y = scan.nextInt();

        Rectangle r = new Rectangle(x, y, width, length);
        double perimeter = r.getHeight()*2+r.getWidth()*2;
        System.out.println("Perimeter = "+perimeter);
        r.setLocation(-1,-3);
        System.out.println("New location is("+r.getX()+","+r.getY()+")");

    }
}
