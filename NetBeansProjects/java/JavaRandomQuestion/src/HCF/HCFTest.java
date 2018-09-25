/*
  This code find and print the Highest Common Factor of two numbers.
  E.g the LCM of 24 and 36 is 12.
*/
package HCF;

/**
 *
 * @author mosh
 */

public class HCFTest {
    public static void main(String[] args) {
        
        System.out.println("The HCF of 24 and 30 is "+hcf(24,36));
    }
    
  public static int hcf(int x, int y){
    int r =0, a =(x>y)?x:y, b =(x<y)?x:y; //a is larger and b is smaller between the two
    r=b;
    while (a%b!=0) {
      r = a%b;
      a = b;
      b = r;
    }
    return r;
  }

  
}
