/*
  This code find and print the Lowest Common Factor of two numbers.
  E.g the LCM of 24 and 30 is 120.
*/
package LCM;

/**
 *
 * @author mosh
 */

public class LCM {
    public static void main(String[] args) {
        
        System.out.println("The Lcm of 24 and 30 is "+lcm(24,30));
    }
    
    public static int lcm(int a, int b){
        int l = a>b ? a : b; // l is larger between the two
        while(true){
            if(l%a==0 && l%b==0){ // If one of the numbers is a factor of the other
                return l;
            }
            ++l;
        }
    }
}
