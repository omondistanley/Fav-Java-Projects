/*Stanley Omondi
*UNI: soo2117
 * A template for a Nim game
 *Game.java
*/ 
import java.util.Random;
import java.util.Scanner;

public class Game{
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    private int level;
    private int turn;
    
    public Game(int difficulty){
        // your code here
        //Instance of the Human and Computer classes(computer class takes the difficulty parameter.) 
        humanPlayer = new Human();
        computerPlayer = new Computer(difficulty);
        this.level = difficulty;
        
    }
     
    public void play(){
        // your code here
        Random r = new Random();
        marbles = r.nextInt(91) + 10;
        Scanner s = new Scanner(System.in);
       
    // you may wish to add more methods here
    if(level == 1 || level == 2) {

        if(level == 1) {
            System.out.println("Playing in easy mode\n");
            this.turn = r.nextInt(2);

            do{
                System.out.println("The number of marbles are " + marbles);
                if(this.turn == 0){ //The human goes first.
                    System.out.println("It's the human's turn.");
                    humanPlayer.move();
                    marbles = marbles - humanPlayer.getChoice();
                    this.turn = 1; // this tells it to go to the next.   
                }
                else if(this.turn == 1) {//The computer goes first.
                    System.out.println("It's the computer's turn.");
                    computerPlayer.move(marbles);
                    marbles = marbles - computerPlayer.getChoice();
                    System.out.println("The computer removes " 
                                        + computerPlayer.getChoice() );
                    this.turn = 0;

                }
            }while(marbles > 1);
        }
        else if(level == 2) {
            System.out.println("Playing in hard mode\n");
            do{
                System.out.println("The number of marbles are " + marbles);
                if(this.turn == 0){ //The human goes first.
                    System.out.println("It's the human's turn.");
                    humanPlayer.move();
                    marbles = marbles - humanPlayer.getChoice();
                    this.turn = 1; // this tells it to go to the next.   
                }
                else if(this.turn == 1) {//The computer goes first.
                    System.out.println("It's the computer's turn.");
                    computerPlayer.move(marbles);
                    marbles = marbles - computerPlayer.getChoice();
                    System.out.println("The computer removes " 
                                        + computerPlayer.getChoice() );
                    this.turn = 0;

                }
            } while(marbles > 1);

        }
                 if(turn == 0 && marbles <= 1) {
                    System.out.println("The Computer wins.");
                    }
                else if(turn == 1 && marbles <= 1) {
                    System.out.println("Congratulations, human won!");
                  }
       
    }
    else {

        System.out.println("Please choose between 1 and 2!");
        
         }
        level = s.nextInt();
    }
    
}
