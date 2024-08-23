import java.util.Scanner;

public class IT24102890Lab4Q3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        // Ternary operator version
        String Result = (number > 0) ? "The number is Positive."
                      : (number < 0) ? "The number is Negative."
                      : "The number is Zero.";
       
        System.out.println(result);
             
        scanner.close();
    }
}
