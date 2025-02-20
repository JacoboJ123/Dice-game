/* This program will produce 2 random numbers from 1-6 representing a dice game, if when the dice are rolled and a total of 7 or 11 are rolled the user wins, if the total adds up to 2, 3, or 12 the user
loses. If none of the dice add up to those win or lose indicators it will continue to re-roll the dice, then you can win if the total is equal to the re-roll. If the new total is 7 you lose but if the
first total is 7 and a re-roll is also 7 you win since they are equal to eachother.*/ 

//importing util for random generator 
import java.util.Random;

//beginning program
public class H7 {
//main
public static void main(String[] args) {

//declaring first set of variables 
int d1;
int d2;
int total;

//Declaring random generator
Random rand = new Random();

//d1 and d2 both getting random integer numbers from 1-6
d1 = rand.nextInt(6) + 1;
d2 = rand.nextInt(6) + 1;

//Getting total for both randomly generated integers
total = d1 + d2;
//Printing out first total of 2 dice 
System.out.println("The total is: " + total);

//Beginning if statement for indicators of a win or a lose or it will continue onto the loop until you win or lose 
if (total == 7 || total == 11){
 System.out.println("Congratulations, you win");
 }
 else if (total == 2 || total == 3 || total == 12){
  System.out.println("You lose");
  }
  else{

//Declaring boolean for dice
boolean dice = true;   
  
// while loop is started for the re-roll sequence until they win or lose the loop will not stop

 while (dice){
 int d4 = rand.nextInt(6) + 1;
 int d5 = rand.nextInt(6) + 1;
 int newTotal = d4 + d5;
 
 // Printing out the new total everytime 2 new numbers are rolled if the user does not win or lose
 System.out.println("The new total is " + newTotal);
 
 //if statement to let the user know they won or lost
  if (newTotal == total){
   System.out.println("Congratulations you win");
   dice = false;
  }
  else if (newTotal == 7){
  System.out.println("You lose");
  }
  }
  // End loop
  }
 

//end
}
//main
}
      

