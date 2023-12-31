//imports
import java.util.Scanner;
import java.util.Random;

public class NumberGame{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumber = 100;
        int minNumber = 1;
        int attemptLimit = 10;
        int points = 0;

        String play = "y";

        while(play.equalsIgnoreCase(play)){
            int randomNo = random.nextInt(maxNumber)+1;
            int attemptNo = 0;

            System.out.println("Guess a number between 1 and " + maxNumber + ". Will you get it correct?: ");

            while(attemptNo < attemptLimit){
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attemptNo++;

                if(guess > maxNumber || guess < minNumber){
                    System.err.println("Please enter a guess between 1 and 100 only.");
                    break;
                }

                if(guess == randomNo){
                    System.out.print("Congrats you have guessed the correct number in " + attemptNo +" attempts. You have " + points + "points.");
                    points++;
                    break;
                } else if(guess < randomNo){
                    System.out.print("Guess too low. Try again.");
                } else{
                    System.out.print("Guess too high. Try again.");
                }
            }

            if(attemptNo == attemptLimit){
                System.out.print("Sorry you ran out of attempts. " + randomNo + " attempts");
            }

            points++;
            System.out.print("Do you want to play again? (y/n): ");
            play = scanner.next();

            if(!play.equalsIgnoreCase("y")){
                break;
            }
        }
        System.out.print("GameOver, You have " + points +" points.");
    }

}