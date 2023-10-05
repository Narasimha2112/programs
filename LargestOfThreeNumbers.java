import java.util.Scanner;

public class LargestOfThreeNumbers 
{
    public static void main(String[] args) 
    {
        int x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Three numbers = ");

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if(x > y && x > z)
        {
            System.out.println("First number is Largest");
        }
        else if(y > x && y > z)
        {
            System.out.println("Second number is Largest");
        }
        else if(z > y && z > x)
        {
            System.out.println("Third number is Largest");
        }
        else
        {
            System.out.println("Entered numbers are not distinct");
        }
    }
    
}
