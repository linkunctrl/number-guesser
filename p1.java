// number guesser 
import java.util.Scanner;
public class p1{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num =  1 + (int)(100 * Math.random());
      int i = 5;
      int index, guess;
      System.out.println(
        "A number is chosen"
        + " between 1 to 100."
        + " Guess the number"
        + " within 5 trials.");

        for (index = 0; index < i; index++) {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();
            while (index == i) {
                System.out.println("You have used up all your guesses");
                System.out.println("The number was " + num);

            }
            if (num == guess) {
                System.out.println("Congratulations! " );
                break;

            }
            else if (num > guess && index != i) {
                System.out.println("Too low!");
            }
            else if (num < guess && index != i ) {
                System.out.println("Too high!");
            }
            

            

        }
        scanner.close();
    }
}