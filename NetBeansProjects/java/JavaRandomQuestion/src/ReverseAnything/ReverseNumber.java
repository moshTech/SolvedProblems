/*
 This code find and print the reverse of a given integer
 E.g. The reverse of 12345 is 54321.
 */
package ReverseAnything;

/**
 *
 * @author mosh
 */
public class ReverseNumber {
    public static void main(String...mosh) {
        System.out.println("The reverse is "+reverse(12345));
    }
    
    public static int reverse(int number){
        int rem, rev=0;
       
        while(number>0){
            rem = number%10; //To get the last digit while the number is decreasing by  one digit at a time
            rev = rev*10 + rem;
            number /=10;
        }
        return rev;
    }
    
    
}
