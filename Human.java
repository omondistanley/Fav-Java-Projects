/*Stanley Omondi
*UNI: soo2117
 * A template for a Human nim player
 *Human.java
*/ 
import java.util.Scanner;

public class Human{
   
    private int choice;
    private Scanner input;
    private int marbles;
    private int marblesLeft;
    
    public Human(){ 
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move(){

       while(choice > marbles/2 || choice < 1){
    
              System.out.println("Please input a valid number: ");
  
        // your code here
            break;
        }
       // System.out.println("reached here");
        choice = input.nextInt();
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
