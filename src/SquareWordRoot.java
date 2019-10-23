import java.util.Scanner;

public class SquareWordRoot
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scan.nextLine();
        double squarednum = Math.sqrt(word.length()+0.5);
        String squaredword = word.substring((int)(squarednum),(int)(squarednum)+1);
        System.out.print("The\"square root\" of"+word+" is "+squaredword);

    }
}
