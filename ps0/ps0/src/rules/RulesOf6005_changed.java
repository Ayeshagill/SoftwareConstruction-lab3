/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */

 package rules;
 import java.util.Scanner;
 
 /**
  * RulesOf6005 represents the collaboration policy of 6.005 as described by the
  * general information on Stellar.
  */
 public class RulesOf6005 {
      
     /**
      * Judge whether a given piece of code may be used in an assignment (problem
      * set or team project) or not, according to the 6.005 collaboration policy.
      * 
      * @param writtenByYourself true if the code in question was written by
      *        yourself or, in the case of a team project, your teammates,
      *        otherwise false.
      * @param availableToOthers if not writtenByYourself, whether or not the
      *        code in question is available to all other students in the class.
      *        Otherwise ignored.
      * @param writtenAsCourseWork if not writtenByYourself, whether or not the
      *        code in question was written specifically as part of a solution to
      *        a 6.005 assignment, in the current or past semesters. Otherwise
      *        ignored.
      * @param citingYourSource if not writtenByYourself, whether or not you
      *        properly cite your source. Otherwise ignored.
      * @param implementationRequired whether the assignment specifically asks
      *        you to implement the feature in question.
      * @return Whether or not, based on the information provided in the
      *         arguments, you are likely to be allowed to use the code in
      *         question in your assignment, according to the 6.005 collaboration
      *         policy for the current semester.
      */
     
 public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
             boolean availableToOthers, boolean writtenAsCourseWork,
             boolean citingYourSource, boolean implementationRequired) {
 
         // Check if the code was written by yourself or your teammates
         if (writtenByYourself) {
             return true; // You can use your own code.
         }
 
         // Check if the code is available to others
         if (availableToOthers) {
             return false; // You cannot use code available to others.
         }
 
         // Check if the code was written as part of a 6.005 assignment
         if (writtenAsCourseWork) {
             return true; // You can use code you wrote for a 6.005 assignment.
         }
 
         // Check if you properly cited your source
         if (citingYourSource) {
             return true; // You can use code if you properly cited it.
         }
 
         // Check if the implementation of the feature is required by the assignment
         if (implementationRequired) {
             return true; // You can use code if it's required for the assignment.
         }
 
         // If none of the conditions are met, you cannot use the code
         return false;
     }
 
     
     /**
      * Main method of the class.
      * 
      * Runs the mayUseCodeInAssignment method.
      * 
      * @param args unused
      */
     
     public static void main(String[] args) {
         // Create a Scanner for user input
         Scanner scanner = new Scanner(System.in);
         
         // Prompt the user for parameter values
         System.out.print("Is the code written by yourself or your teammates? (true/false): ");
         boolean writtenByYourself = scanner.nextBoolean();
         
         System.out.print("Is the code available to others? (true/false): ");
         boolean availableToOthers = scanner.nextBoolean();
         
         System.out.print("Is the code written as course work for 6.005? (true/false): ");
         boolean writtenAsCourseWork = scanner.nextBoolean();
         
         System.out.print("Did you properly cite your source? (true/false): ");
         boolean citingYourSource = scanner.nextBoolean();
         
         System.out.print("Is the code required for the assignment? (true/false): ");
         boolean implementationRequired = scanner.nextBoolean();
         
         // Call the mayUseCodeInAssignment method with user-input values
         boolean result = mayUseCodeInAssignment(writtenByYourself, availableToOthers, writtenAsCourseWork, citingYourSource, implementationRequired);
 
         // Print the result
         if (result) {
             System.out.println("You may use the code in your assignment.");
         } else {
             System.out.println("You may not use the code in your assignment.");
         }
         // Close the scanner
         scanner.close();
     }   
 }