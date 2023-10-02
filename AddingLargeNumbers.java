import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers 
{
    public static void main(String[] args) 
    {
        String num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number = ");
        num1 = sc.nextLine();

        System.out.println("Enter the Second Number = ");
        num2 = sc.nextLine();

        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum;

        sum = first.add(second);

        System.out.println("Result of Addition is = " +sum );
    }
}
