import java.util.Scanner;

public class NestedIfElse 
{
    public static void main(String[] args) 
    {
        int marksObtained, passingMarks;
        char grade;

        passingMarks = 40;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks = ");
        marksObtained = sc.nextInt();

        if(marksObtained >= passingMarks)
        {
            if(marksObtained > 90)
                grade = 'A';

            else if(marksObtained > 80)
                grade = 'B';

            else if(marksObtained > 70)
                grade = 'C';

            else if(marksObtained > 60)
                grade = 'D';

            else 
                grade = 'E';

            System.out.println("You passed the Eaxm and Your grade is " + grade);
        }
        else
        {
            grade ='F';
            System.out.println("You Failed The Exam and your grade is "+ grade);
        }
    }
}
