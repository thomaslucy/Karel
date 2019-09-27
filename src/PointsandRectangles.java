import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.Scanner;

public class PointsandRectangles
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the x coordinate: ");
        int xc = scan.nextInt();
        System.out.println("Enter the y coordinate: ");
        int yc = scan.nextInt();
        System.out.println("Enter the length: ");
        int l = scan.nextInt();
        System.out.println("Enter the width: ");
        int w = scan.nextInt();
        Point p = new Point(xc,yc);
        System.out.println(p);
        Dimension d = new Dimension(l,w);
        System.out.println(d);
        Rectangle z = new Rectangle(xc, yc, w, l);
        System.out.println(z);



    }

}
