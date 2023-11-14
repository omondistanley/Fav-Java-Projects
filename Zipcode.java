/*Stanley Omondi
*UNI: soo2117
 * Zipcode to barcode conversion
 *Zipcode.java
*/ 
public class Zipcode {
//instance variables.
     private int zip;        private int checkDigit;    private int sum; 
     private String bar;     private String bar0;       private String bar1; 
     private String bar2;    private String bar3;       private String bar4;
     private String bar5;    private String bar6;       private String bar7;
     private String bar8;    private String bar9;       private String newbars;
     private int check_digit;
        // private static String k;  private static int digit;
     
    public Zipcode(int zip) {//constructor for zipcode to barcode
         this.zip = zip;
          zip = 0;          bar0 = "||:::";   bar1 = ":::||";   bar2 = "::|:|";
          bar3 = "::||:";   bar4 = ":|::|";   bar5 = ":|:|:";   bar6 = ":||::"; 
          bar7 = "|:::|";   bar8 = "|::|:";   bar9 = "|:|::";   Barcode();
    }

    public Zipcode(String bar) {
         this.bar = bar;
         zip = 0;          bar0 = "||:::";   bar1 = ":::||";    bar2 = "::|:|";
         bar3 = "::||:";   bar4 = ":|::|";   bar5 = ":|:|:";    bar6 = ":||::";   
         bar7 = "|:::|";   bar8 = "|::|:";   bar9 = "|:|::";    ZIPcode();
    }

    public void checkDigit(int zip) { 
        int rem; //the zipcode and values of the zip code
        rem = zip%10;
        //sum; //stores the sum of each digit    
        sum = sum + rem;
        int checkDigit;
        if(sum % 10 == 0){
            checkDigit = 0;
        }
        else {
            checkDigit = 10 - (sum % 10);
        }

    }
    public int checkDigit() {
         System.out.println("The checkDigit is: " + checkDigit);
         return checkDigit;
     }
    public static String convertBar(int checkDigit) {
        //the initialization to bar0-bar9 can't be considered here:) 
        if (checkDigit == 1) { 
            return ":::||"; 
        } 
        else if (checkDigit == 2) { 
             return "::|:|"; 
        }
        else if(checkDigit == 3) {
            return "::||:";
        }
        else if(checkDigit == 4) {
            return ":|::|";
        }
        else if(checkDigit == 5) {
             return ":|:|:";
         }
        else if(checkDigit == 6) {
             return ":||::";
         }
        else if(checkDigit == 7) {
             return "|:::|";
        }
        else if(checkDigit == 8) {
             return "|::|:";
        }
        else if(checkDigit == 9) {
            return "|:|::";
        }
        else if(checkDigit == 0) {
            return "||:::";
        }
        else {
            return null;
        }
  }
    public void Barcode() {
            newbars = "";
         for(int i = 0; i<5; i++) {
            //performs 5 iterations as the zipcode has five digits.
            int rem;//gets the values in the zipcode and the zipcodes
            rem = zip%10;
            //sum; stores the summation of the digits in the zipcode.
            sum = sum + rem;
            if(sum%10 == 0) {
                checkDigit =0;
            }
            else{
                checkDigit = 10 - (sum%10); //modifies it to a multiple of ten.
            }
        switch(this.zip%10) {
            case 0: newbars = bar0 + newbars; break;
            case 1: newbars = bar1 + newbars; break;
            case 2: newbars = bar2 + newbars; break;
            case 3: newbars = bar3 + newbars; break;
            case 4: newbars = bar4 + newbars; break;
            case 5: newbars = bar5 + newbars; break;
            case 6: newbars = bar6 + newbars; break;
            case 7: newbars = bar7 + newbars; break;
            case 8: newbars = bar8 + newbars; break;
            case 9: newbars = bar9 + newbars; break;
        }
        this.zip = this.zip/10;
      }
    newbars = "|" + newbars + convertBar(checkDigit()) + "|";
    }

    public String getBarcode(){
        return newbars;
    }
//Code for barcode to zipcode.
    
    public void ZIPcode() {
        if(bar.length() == 32) {
        for(int i = 1; i<bar.length()-6; i+=5) {
            //gives us values between 1 and 25{the zip code values.}
            String j = bar.substring(i, i+5);//gives values of the bar in the 
                                              //range for our use.  
            if(j.equals(bar1)){
                zip = zip*10 +1;
            }
            else if(j.equals(bar2)){
                zip = zip*10 +2;
            }
            else if(j.equals(bar3)){
                zip = zip*10 +3;
            }
            else if(j.equals(bar4)){
                zip = zip*10 +4;
            }
            else if(j.equals(bar5)){
                zip = zip*10 +5;
            }
            else if(j.equals(bar6)){
                zip = zip*10 +6;
            }
            else if(j.equals(bar7)){
                zip = zip*10 +7;
            }
            else if(j.equals(bar8)){
                zip = zip*10 +8;
            }
            else if(j.equals(bar9)){
                zip = zip*10 +9;
            }
            else if(j.equals(bar0)){
                zip = zip*10 +0;
            }
        }
    }
    else{
        System.out.println("There was a mistake: please try again.");
    }
    }
    public int getZIPcode(){
        return zip;
    }
    public void check_digit() {
        if(bar.length() == 32) {
        for(int i = 26; i < bar.length() - 2; i+=5) {
            String K = bar.substring(i, i+=5);
            if(K.equals(bar0)) {
                check_digit = 0;
            }
            else if(K.equals(bar1)) {
                check_digit = 1;
            }
            else if(K.equals(bar2)) {
                check_digit = 2;
            }
            else if(K.equals(bar3)) {
                check_digit = 3;
            }
            else if(K.equals(bar4)) {
                check_digit =4;
            }
            else if(K.equals(bar5)) {
                check_digit =5;
            }
            else if(K.equals(bar6)) {
                check_digit =6;
            }
            else if(K.equals(bar7)) {
                check_digit = 7;
            }
            else if(K.equals(bar8)) {
                check_digit = 8;
            }
            else if(K.equals(bar9)) {
                check_digit = 9;
            }
        }
        }
        else{
        System.out.println("There was a mistake: please try again.");
    }
    }
    public int getcheck_digit(){
        System.out.println("The check digit is: " + check_digit);
        return check_digit;
    }
}

