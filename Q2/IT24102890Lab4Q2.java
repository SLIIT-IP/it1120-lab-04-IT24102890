import java.util.Scanner;

public class IT24102890Lab4Q2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Please enter exam marks(out of 100):");
double exammarks = input.nextDouble();

if(exammarks<=0||exammarks>=100)
{
System.out.println("Invalid input for exam marks.Terminating program");
}

System.out.print("Please enter lab submission marks(out of 100):");
double labmarks = input.nextDouble();

if(labmarks<=0||labmarks>=100)
{
System.out.println("Invalid input for exam marks.Terminating program");
}

System.out.print("Please enter the percentage given for the exam:");
double exampercentage = input.nextDouble();

System.out.print("Please enter the percentage given for the lab submission:");
double labsubmissionpercentage = input.nextDouble();

if(exampercentage+labsubmissionpercentage!=100)
{
System.out.println("The percentages must adds up to 100.Terminating program");
}

double finalmark = (exammarks*exampercentage/100 + labmarks*labsubmissionpercentage/100);
System.out.println("Final exam mark is:" + finalmark);
}
}