// swap 2 numbers using Third variable //

import java.util.Scanner;

public class swapnumbers1 
{
    public static void main(String[] args) 
    {
        int x,y,temp;
        System.out.println("Enter X & Y values");
        Scanner sc=new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swapping \n x = "+x+" y = "+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping \n x = "+x+" y = "+y);
    }
}
