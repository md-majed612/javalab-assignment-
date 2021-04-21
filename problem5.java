import java.util.Scanner;

public class problem5 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you 1st integer: ");
        int a;
        a = input.nextInt();
        System.out.println();
        int b;
        System.out.print("Enter your 2nd intger: ");
        b = input.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println();
        System.out.println("Quotient is: "+quotient+" and remainder is: "+remainder);
    }
}
