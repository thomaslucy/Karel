import java.util.Scanner;

public class Names
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        System.out.println("Enter last name");
        String first = scan.nextLine();
        String last = scan.nextLine();
        int firstlength = first.length();
        int lastlength = last.length();
        int firsts = first.substring(0,1)+last.substring(0,1);
        int compare = first.compareTo(last);

    }
}
