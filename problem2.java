import java.util.Scanner;

public class problem2 {

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
        int sum=  a+b;
        System.out.println();
        System.out.println("Summatio of "+a+" and "+b+" is: "+sum);
    }
}
