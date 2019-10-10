import java.util.Scanner;

public class TheNameGame
{
        public static void verse (String firstname)
        {
            System.out.println(firstname+" "+firstname+", bo-b"+firstname.substring(1));
            System.out.println("Banana-fana fo-F"+firstname.substring(1));
            System.out.println("Fe-fi-mo-M"+firstname.substring(1));
            System.out.println(firstname.toUpperCase()+"!");
        }

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstname = scan.nextLine();
        System.out.println("What is your last name?");
        String lastname = scan.nextLine();

        verse(firstname);
        System.out.println(" ");
        verse(lastname);



    }
}
