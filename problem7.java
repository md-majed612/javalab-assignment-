import java.util.Scanner;

public class problem7 {
    public  static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");

        int i = input.nextInt();
        if(i%2==0)
        {
            System.out.println(i+" is an Even number: ");
        }
        else
        {
             System.out.println(i+" is a Odd number: ");
        }

    }
}
