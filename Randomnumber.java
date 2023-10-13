import java.util.*;
public class Randomnumber {
    public static void main(String args[]){
        boolean hasWon = false;
        int randomNum = (int) (Math.random()*100)  + 1;
        System.out.println("I have randomly choosen a number between 1 to 100");
        System.out.println("Try to guess it");
        Scanner sc = new Scanner(System.in);
      for(int i=10;i>0;i--){
        System.out.println("You have " + i +  " guess(es) left . Guess Again");
        int guess = sc.nextInt();
        if(randomNum<guess)
        {
            System.out.println("Its Smaller then  " + guess + " guess");
        }
        else  if(randomNum>guess){
            System.out.println("Its greater then " + guess + " guess");
        }
        else {
        hasWon=true;
         break;

        }
       
      } if(hasWon){
            System.out.println("CoRRECT...YOU WIN !!!");
        } else {
          System.out.println("GAME OVER .....YOU LOOSE");
          System.out.println("The Number was : "+randomNum);  
        }

         
    }
}