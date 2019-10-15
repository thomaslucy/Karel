import java.util.Scanner;

public class Password
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("First name: ");
        System.out.println("Middle name: ");
        System.out.println("Last name: ");
        System.out.println("Age: ");
        String first = scan.nextLine();
        String middle = scan.nextLine();
        String last = scan.nextLine();
        int age = scan.nextInt();
        String part1 = first.substring(first.length()/2,first.length()/2+1)+middle.substring(middle.length()/2,middle.length()/2+1)+last.substring(last.length()/2,last.length()/2+1);
        String part2 = first.substring(first.length()-1)+middle.substring(middle.length()-1)+last.substring(last.length()-1);
        int part3 = age*75;
        System.out.println("Password: "+part1.toUpperCase()+part2+part3);
    }
}
