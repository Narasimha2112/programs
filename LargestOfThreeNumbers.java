import java.util.Scanner;

public class LargestOfThreeNumbers 
{
    public static void main(String[] args) 
    {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three numbers = ");

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

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
