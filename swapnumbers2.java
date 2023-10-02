// swap 2 numbers without using Third variable //

import java.util.Scanner;

public class swapnumbers2
{
    public static void main(String[] args) 
    {
        int x,y;
        System.out.println("Enter X & Y values");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swapping \n x = "+x+" y = "+y);

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After Swapping \n x = "+x+" y = "+y);
    }
}
