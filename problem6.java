import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("before swapping numbers: "+a +"  "+ b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: "+a +"   " + b);
        System.out.println( );
    }
}
