import java.util.Scanner;

/**
 * Write a description of class BabylSqrt here.
 * 
 * @author Mr. King 
 * @version 11/5/2021
 */
public class BabylSqrt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to take the square root: ");
        double num = input.nextDouble();
        System.out.print("Margin of error: ");
        double err = input.nextDouble();
        double ans = sqrt(num, err);
        System.out.println("The square root of " + num + " is " + ans);
    }
   
    /**
     * Use the Babylonian Method to approximate the square root.
     * @param n    - the number to approximate the square root of.
     * @return err - the margin of error (when to stop).
     */
    public static double sqrt(double n, double err)
    {
        double lastGuess = 1;
        double nextGuess = 0;
        double diff = 1;
        
        while(diff > err)
        {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            diff = Math.abs(nextGuess - lastGuess);
            lastGuess = nextGuess;
        }
        
        return nextGuess;
    }
}
