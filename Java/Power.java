// William Thing
// Jan 24, 2015

public class Power {
   public static void main(String[] args) {
      System.out.println(power(2, 3));
      System.out.println(Math.pow(2, -4));   // used to check if the method works
      System.out.println(power(2, -4));
      System.out.println(power(2, 0));
      System.out.println(power(5, 44));
   }

   
   // post: recursive function that returns the power of given a by b
   public static double power(double a, double b) {
      if (b == 0) {
         return 1;
      } else if (b==1) {
         return a;
      } else if (b<0) {
         return (1 / power(a, -b));
      } else {
         return a * power(a, b-1);
      }
    }
}