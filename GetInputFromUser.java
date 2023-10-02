import java.util.Scanner;

public class GetInputFromUser
{
    public static void main(String[] args) 
    {
        int Phno;
        String name;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name:- ");
        name = sc.nextLine();
        
        System.out.println("Enter your mobile number:- ");
        Phno = sc.nextInt();

        System.out.println( name + " Your mobile number is " +Phno);
    }
}