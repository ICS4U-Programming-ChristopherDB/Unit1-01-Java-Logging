package com.example;

import java.util.Scanner;

/**
 * Logging calculator.
 *
 * @author Christopher Di Bert
 * @version 1.0
 * @since 2024-02-22
 */
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
    final int maxTruckWeight = 1100;
    // Weight of a log in kg per metre of length.
    final int logWeight = 20;

    // Declares the valid log lengths.
    final float[] logLengths = {0.25f, 0.5f, 1.0f};

    // Displays the log length options to the user.
    for (int i = 0; i < logLengths.length; i++) {
      System.out.println((i + 1) + ". " + logLengths[i] + "m");
    }

    // Tells the user to enter a listed log length.
    System.out.print("Enter the list number of your log length: ");

    // Checks if the user entered a listed length option.
    try {
      // Gets the user's length choice.
      final int logLengthChoice = sc.nextInt() - 1;
      // Calculates the number of logs the truck can contain.
      float divisor = logWeight * logLengths[logLengthChoice];
      float maxLogs = maxTruckWeight / divisor;
      // Displays the number of logs the truck can contain.
      System.out.print("You can fit " + maxLogs);
      System.out.println(" logs in the truck.");
    } catch (Exception e) {
      // Tells the user they did not choose a listed length.
      System.out.println("You must enter a listed length!");
    }
  }
}
