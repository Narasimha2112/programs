import java.util.Scanner;

public class ifelse 
{
    public static void main(String[] args) 
    {
        int marksObtained, passingMarks;

        passingMarks = 40;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks = ");
        marksObtained = sc.nextInt();

        if(marksObtained >= passingMarks)
        {
            System.out.println("You passed the exam");
        }
        else
        {
            System.out.println("Unfortunately you failed the exam");
        }
    }
}
