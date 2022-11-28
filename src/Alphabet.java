import java.util.Scanner;

public class Alphabet
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        char ch;
        System.out.println("Enter any character");

         ch = obj.next().charAt(0);

        /*if (ch.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else*/
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                System.out.println("\nIt is a Vowel.");
            else
                System.out.println("\nIt is a Consonant.");
        }
        else
            System.out.println("number");
        
    }
}
