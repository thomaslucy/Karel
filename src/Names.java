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
        String firsts = first.substring(0,1)+last.substring(0,1);
        int compare = first.compareTo(last);
        String lastoffirst = first.substring(firstlength-1);
        int index1 = last.indexOf(lastoffirst);
        String lastoflast = last.substring(lastlength-1);
        int index2 = first.indexOf(lastoflast);
        String ffisrt =first.substring(0,firstlength/2)+last.substring(lastlength/2);
        String llast = last.substring(0,lastlength/2)+first.substring(lastlength/2);

        System.out.println(first+" "+last);
        System.out.println(firstlength+lastlength);
        System.out.println(firsts);
        System.out.println(compare);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(ffisrt+" "+llast);

    }
}
