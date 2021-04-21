import java.util.Scanner;

public class problem3 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you 1st integer: ");
        float a;
        a = input.nextFloat();
        System.out.println();
        float b;
        System.out.print("Enter your 2nd intger: ");
        b = input.nextFloat();
        float multy=  a*b;
        System.out.println();
        System.out.println("multiplication of "+a+" and "+b+" is: "+multy);
    }
}
