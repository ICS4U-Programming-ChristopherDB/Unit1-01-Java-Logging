package com.example;

/**
 * Logging calculator.
 *
 * @author Christopher Di Bert
 * @version 1.0
 * @since 22-2-2024
 */

import java.util.Scanner;

// Logging class.
public final class Logging {

  /** Private constructor to prevent instantiation. */
  private Logging() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {

    Scanner sc = new Scanner(System.in);

    // Maximum weight the truck can support.
    final int MAX_TRUCK_WEIGHT = 1100;
    // Weight of a log in kg per metre of length.
    final int LOG_WEIGHT = 20;

    // Declares the valid log lengths.
    final float[] LogLengths = {0.25f, 0.5f, 1.0f};

    // Displays the log length options to the user.
    for (int i = 0; i < LogLengths.length; i++)
    {
      System.out.println((i+1) + ". " + LogLengths[i] + "m");
    }

    // Tells the user to enter a listed log length.
    System.out.print("Enter the list number of your log length: ");

    // Checks if the user entered a listed length option.
    try {
      // Gets the user's length choice.
      final int logLengthChoice = sc.nextInt() - 1;
      // Calculates the number of logs the truck can contain.
      float maxLogs = MAX_TRUCK_WEIGHT / (LOG_WEIGHT * LogLengths[logLengthChoice]);
      // Displays the number of logs the truck can contain.
      System.out.println("You can fit " + maxLogs + " logs in the truck.");
    } catch (Exception e) {
      // Tells the user they did not choose a listed length.
      System.out.println("You must enter a listed length!");
    }
  }
}
