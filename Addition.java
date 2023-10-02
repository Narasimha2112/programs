import java.util.Scanner;

public class Addition 
{
    public static void main(String[] args) 
    {
        int x,y,z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Values of X,Y  = ");

        x = sc.nextInt();
        y = sc.nextInt();

        z = x+y;

        System.out.println("The sum of entered numbers is = " +z);
    }
    
}
