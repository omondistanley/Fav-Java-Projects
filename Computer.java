/*****************************************
 * A template for a computer Nim player
 ****************************************/ 
 import java.util.Random;
 import java.util.Scanner;

public class Computer{
    
    private int mode;
    private int choice;
    
    public Computer(int m){
        mode = m;
        choice = -1;
    }
    
    public void move(int marblesLeft){
    
        Random r = new Random();

        // your code here

        if(mode ==1 ) {
            System.out.println("Computer is playing stupid mode.");

            choice = r.nextInt(marblesLeft/2)+1;
        }

        else{

            System.out.println("Computer is playing smart mode.");

            if(marblesLeft > 63) {

                choice = marblesLeft - 63;

            }

            else if(marblesLeft > 31 && marblesLeft<63) {
                    choice = marblesLeft -31;
            }
            else if(marblesLeft > 15 && marblesLeft<31) {
                choice = marblesLeft - 15;
            }
            else if(marblesLeft > 7 && marblesLeft <15) {
                choice = marblesLeft - 7;
            }
            else if(marblesLeft >3 && marblesLeft < 7) {
                choice = marblesLeft - 3;
            }
            else {
                choice = marblesLeft - 1;
            }
        }
        
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
