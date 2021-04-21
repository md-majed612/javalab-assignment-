import java.util.Scanner;

public class problem4 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an character: ");
        char a;
        a = input.next().charAt(0);
        System.out.println();
        int ans = a;
        System.out.println();
        System.out.println("ASCII value of "+a+" is: "+ans);
    }
}
