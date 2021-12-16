import java.util.*;
public class GreedKataAssesment{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in); //Scanner object
      Random rand = new Random(); //Random object
   
      int[] arr = new int[5]; // array of the result of dice roll
      
      System.out.print("Welcome to Greed Kata, \nGreed is a press-your-luck dice rolling game. "
                        + "\nIn the game, you will role the dice and try to earn as many points as possible from the result. "
                        + "\nIf you would like to Roll your 5 dice type 'roll': ");
      String rolldiceinput = input.nextLine();
   
      if(!rolldiceinput.equals("roll")){
         return;
      }
      
      for(int i=0; i<= arr.length-1; i++) {
         arr[i] = rand.nextInt(6) + 1;
         System.out.println("Dice" + ((i)+ 1) + " roll = " + arr[i]+" ");
      }
      
      int score = computeScore(arr);
      System.out.println("Total score: " + score);

   }

   public static int computeScore(int[] arr) {
      int[] values = new int[6];       // To store number of appearance of each side of dice
      int score = 0;                  // Total score obtained by rolling dices
   
        // Counting the number of appearance of each side in dices index0=dice1   index5=dice6
      for(int i = 0; i < arr.length; i++){
         values[arr[i]-1] ++;
      }
   
        // Adding 3 of the same side die to the score
      for(int i = 0; i < values.length; i++){
         if(values[i] > 2){
            if(i == 0) {
               score += (i+1) * 1000;
            } else {
               score += (i+1) * 100;
            }
            values[i] -= 3;     
         }
      }
   
        // Adding remaining 1 and 5 (the occurences of less than 3) to the score (index 0 = dice 1), (index 4 = dice 5)
      score += values[0] * 100 + values[4] * 50;
   
      return score;
   }
}
