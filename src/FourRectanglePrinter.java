import java.awt.*;

public class FourRectanglePrinter
{
    public static void main(String [] args)
    {
        int width = 5;
        int height = 7;
        Rectangle r = new Rectangle(0,0,width, height);
        System.out.println(r);
        r.translate(5,0);
        System.out.println(r);
        r.translate(0,7);
        System.out.println(r);
        r.translate(-5,0);
        System.out.println(r);

    }
}
