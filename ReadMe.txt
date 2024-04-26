/*Stanley Omondi
*UNI: soo2117
*ReadMe file explaining my approach.
*HW6
*/

PROBLEM 1: THE NIM GAME:
- Identify a sequence:
        Nim  -> Game ->(Computer and Human)
- Took the family tree approach; Nim.java is the parent to Game.java which 
    which parents both human and computer.
- The order of approach, when the Nim class is called; it calls the Game class
    which calls both the human and computer classes.
- No edits done to the nim class.
- Begin from the bottom going up. (begin from Human and Computer then go to Game)
- 
        IN THE HUMAN Class;
- Assume the human knows and plays by the rules. 
- Take in the users' input as the choice.
- The choice is then used to modify the number of marbles left(after human plays.)

        IN THE COMPUTER CLASS;
- Import the random method.(Use it to determine randomly whether the computer
        plays smart or stupid) - this is later overridden when we take in the 
        level.)
                            (Use it to determine the number of marbles the 
                            computer takes while in stupid mode.)
- Within the move method, initialize random;
        (this is in such a way that the random no. of marbles picked by the 
        computer are less than no of marbles left and greater than 1.)
        NOTE:This only happens when the computer is in mode 1; which is when 
        the computer is playing stupid.
    -Use the getter method to access the computer's random choice.
    - Prompts indicating the mode in which the computer is playing to keep track.

- Create it statement telling the computer what to do when in modes 1 and two;
        if(mode - 1) - computer plays stupid; in mode 2 it plays smart.
    - Mode serves the same role as the level of difficulty and therefore can only 
    be the two options given; 1 or 2.
- when in mode 2(smart) have if statements telling the computer what to do when 
    the number of marbles is not equal (2^n - 1) i.e 3,7,15,31 and 63.
    NOTE: This is done on a case by case basis to encompass all the optiions.

- to determine choice while in smart mode, subtract the no. of marblesLeft 
        from marbles.
-Use a getter method to acquire this choice.

                IN THE GAME CLASS:
Import random;
    - Used to generate a random starting number of marbles in the range of 10 to 100.
    - Have an if statement telling the game to play on when the level input by the player
        is either 1 or 2. else prompt the user to try again unitl user chooses 
        either 1 or 2.
    - Use the random to generate a two numbers, to determine which player goes
        first - the computer or human.
NOTE: 
    - initialize humanPlayer and computerPlayer to take in the classes Human
        and computer into the game.
    - have an if else statement showing what happens in each turn.
    - nest a do while loop in the if statement and else if - which only evaluates when true.
    - use the humanPlayer to parse in the move method from the Human class
        so as to acquire the human's choice and use it to determine the marblesLeft.
        marblesLeft = marbles - choice.
    -use the computerPlayer to parse in the move method from the Computer class
        and acquire the computer's choice which is used to determine the
        marbleleft.
    (applies to both levels 1 and 2.
     only difference is when level is 1 mode in the computer class is one and 
     the computer plays stupid.
     when level is 2 mode in computer class is 2 and the compute plays smart.)

PROBLEM2: ZIPCODE AND BARCODE CONVERSION  

- Begin by creating a Zipcode class and declaring the variables.
- Have an overloaded constructor - when converting from zipcode to barcode 
    and vice versa.
- Initialize the variables to use in both constructors; not that even common 
    variables are initialized in each constructor.
- simplify the work by initializing the bars too(The Bar representation of 
    numbers in string instance variables.)
- Create a checkdigit method taking in the int zip which is the zipcode provided
    by the user.
- In this method; 1. declare and initialize a variable to store the zipcode and
                     the values in the zipcode.
                  2. Have a sum variable to store the sum of the zipcode.
                  3. Using the sum; determine the checkdigit - have an if 
                  statement to easen the work here.

- Create a method that returns the checkdigit.
- create a method that converts the check digit to a string of bars.
- Create a method to converts the other numbers in the zipcode to bars.
- In this method: 1: initialize a new empty variable.
                  2. have a for loop making five iterations. This is because the 
                  zipcode has five digits thus the for loop will help us come up 
                  with bar codes for each digit in the zipcode.
                  3. as in the checkdigit; find and store each digit in the zipcode.
                  4. nest the if statement for the method of checkdigit in here;
                  helps to make work easier as well as parse in the method making it 
                  a helper method.
                  5. nest a switch case loop in the for loop - the switch case helps in
                  the conversion from digit of zip to bar.
                  6. in the switch case; have a variable that is updated, when the digit
                  is converted to bars.
                  7. since this is a for loop, the variable gets updated for all digits from 
                  the last to the first in a right to left order.
                  8. after the for loop; concatenate the the frame to the variable and checkdigit(in bars)
- Create a method that returns the barcode generated.

    To convert the string barcode to a zipcode (int);
- Create a method to generate the zipcode from barcode;
- In this method ; 1. Have an if statement with condition that the length of 
                      string bar should be 32.
                   2. Nest a for loop in the if statement, with conditions that;
                    it begins from the second value and ends right after the 
                    bars for the fifth digit in the zipcode.
                  3. Declare and initialize a string taking in the values of 
                  single digit given by the five characters in the bar string(to 
                  do this use substrings.)
                  4. Use the if statement to convert the bars to digit.
 - Create a method that returns the zipcode generated.
 - Create a method to generate the check digit of the bar string.
 - In this method: 
                    1. Have an if statement with condition length of bar string 
                   equals to 32.
                   2. Nest a for loop with conditions that the first term is the 
                   term 26, after the last term in the zipcode, and the length considered 
                   is length of bar string minus 2.
                   3. Have a string declared and initalized taking in the substring btn 
                    26 and 31 - the bars.
                  4. Use an if else to convert the bars to a digit - this is the 
                  check digit generated.
- Create a method that returns the digit generated as the check digit.





