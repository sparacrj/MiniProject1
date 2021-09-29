/*
Mini Project 1
Group 8: Reese Sparacia, Peyton Hicks, Austin Stallings, Joseph Hannah
9/29/2021
*/
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner s = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("Please enter any postitve whole number: ");
    
    int userNum = s.nextInt();
    int randomNum = rand.nextInt(userNum);
  

  System.out.println("A random number guess has been generated");
  
  playGame(userNum, randomNum);
  
}

public static void playGame(int userNum, int randomNum)
{
System.out.println("Please guess a number between 0 and " + userNum);

Scanner s = new Scanner(System.in);
int userGuess = s.nextInt();
int numTries = 1;

while(userGuess != randomNum)
{
  numTries++;

  if(userGuess > randomNum){
    System.out.println("Guess Lower");
    System.out.println("Enter your new guess:");
    userGuess = s.nextInt();
  }

  else if (userGuess < randomNum){
    System.out.println("Guess Higher");
    System.out.println("Enter your new guess:");
    userGuess = s.nextInt();
  }

}

System.out.println("Great, you win! It took you " + numTries + " tries.");

}
    

  } 
