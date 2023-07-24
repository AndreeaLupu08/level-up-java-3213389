package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
  private static int points = 10;
  private boolean isStillPlaying = true;
  private int current = 0;

  while(this.isStillPlaying)
  {
    printTryToDouble();
    if (shouldDouble()) {
      doubleCurrent();
      printCongrats();
      askUserToContinue();
    } else {
      printLost();
      return;
    }
  }

  printWalkawayMessage();

  public boolean shouldDouble() 
    {
      Random random =new Random();
     if(random.nextInt(2)>0)
     {
      return true;
     }
    return false;
  }

  public static void printWalkawayMessage()
  {
    System.out.println("Thank you for playing!");
  }

  public void PlayGame() {
    printWelcome();
    askUserToContinue();}

  private void printTryToDouble() {
     System.out.println("Let's try to double it");
  }

  private void doubleCurrent() {
  }

  private void printCongrats() {
    System.out.println("Congrats! You now have"+this.current+"points");
  }

  private void printWelcome() {
    System.out.println("Let's play double or nothing game");
  }

  private void printLost() {
    System.out.println("You've lost, no points for you!");
  }

  private void askUserToContinue() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Press any key to continue");
    String key = scanner.nextLine();
    if (key.isEmpty()){
      scanner.close();
    }
  }
}