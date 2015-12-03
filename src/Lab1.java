import java.util.Random;
import java.util.Scanner;

public class Lab1 {
 private static final int Dice = 0;

public static void main(String[] args) {	
	 Scanner input = new Scanner(System.in);
	 Random r = new Random();
	 int FinalGuess;
	 int ComputerNumber;
	 int DiceNum=0;
	 boolean continueLoop = true;
	do
	{
	 try 
	 {
	 System.out.println("Choose 1 to 3 dices to roll");
	continueLoop = false;
	DiceNum = input.nextInt();
	 } catch ( Exception Error)
	 {
		 System.out.println("Exception: %s\nPlease Try Again!");
	 }
	 int computer = r.nextInt(((DiceNum)*6) - DiceNum + 1) + DiceNum ;
		ComputerNumber = computer;
	} while (continueLoop);
 
	 
	System.out.println(" Guess the value of the dices rolled");
	int guess = input.nextInt();
	
	 
		
	 if (guess == ComputerNumber)
	 {
	 System.out.println("Congrats you have guessed correctly");
	 }
	 else// (guess != ComputerNumber)
	  {
		 System.out.println("Sorry that is not the right answer");
	  }
 System.out.printf("Correct answer was: %d", ComputerNumber);

}
}



