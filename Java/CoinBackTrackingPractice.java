/*
Give list of coins and amount in dollars, find all the possible coin combinations which makes the given amount.
     dollar (100), quarter (25) , dime (10) , nickel (5), penny (1)
  coinTypes [100, 25, 10 , 5 ,1 ]
void printCombinations(int sum, int n) // print first N combinations which requires fewest number of coins to get amount “sum”

e.g. 
Input: 11 cents, get first 2
     Total combinations 
           11 pennies, 0 nickel, 0 dimes, 0 quarters, 0 dollars // 11 coins
           6 pennies, 1 nickel, 0 dimes, 0 quarters, 0 dollars   // 7 coins
           1 pennies, 2 nickel, 0 dimes, 0 quarters, 0 dollars   // 3 coins
           1 pennies, 0 nickel, 1 dimes, 0 quarters, 0 dollars   // 2 coins

     first 2 should return  
        void printCombinations(int 11, int 2)
        -> 1 pennies, 2 nickel, 0 dimes, 0 quarters, 0 dollars
        -> 1 pennies, 0 nickel, 1 dimes, 0 quarters, 0 dollars

     first 3 should return 
        void printCombinations(int 11, int 3)
        -> 6 pennies, 1 nickel, 0 dimes, 0 quarters, 0 dollars   // 7 coins
        -> 1 pennies, 2 nickel, 0 dimes, 0 quarters, 0 dollars   // 3 coins
        -> 1 pennies, 0 nickel, 1 dimes, 0 quarters, 0 dollars   // 2 coins
*/

import java.util.*;

public class coinBackTrackingPractice {

   public static int[] coinTypes = {1, 5, 10, 25, 100};

   public static void main(String[] args) {
      printCombinations(11, 3);

   }

   public static void printCombinations(int sum, int n) {
      int[] coinCombination = new int[coinTypes.length];
      printCombinations(sum, n, 0, 0, coinCombination);
      
      
       
   
   }

   private static void printCombinations(int sum, int n, int count, int, index, int[] coinCombination) {
      // reach n coin combinations to print
      if (count == n) {
         // stop
      } else {
         int times = sum / coinTypes[index];
         
         for (int i = 0; i <= times; i++) {
            int result = times - i;
            sum = sum - (coinTypes[index] * result);
            coinCombination[index] = result;
            
            printCombinations(sum, n, count+1, index+1, coinCombination);
            
            printCombination(
            
            if (sum == 0) {
               //printACombination();
            }
            
         } 
      
      }


   }
   
   private static void printACombination(int[] coinCombination) {
      // get each individual coin results and concat with string of coin type
      String pennies = coinCombination[0] + " pennies, ";
      String nickels = coinCombination[1] + " nickels, ";
      String dimes = coinCombination[2] + " dimes, ";
      String quarters = coinCombination[3] + " quarters, ";
      String dollars = coinCombination[4] + " dollars";
      // prints the result
      System.outprint(pennies + nickels + dimes + quarters + dollars);
   
   }
}