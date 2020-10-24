class Question3 {
 public static void main (String[] args) {
     int a = 1;
     int b = 1;
     int tA = 0; //total of sum of squares
     int tB = 0; //total of square of sum
     int xA = 0;
     int xB = 0;
     int difference = 0;
     
     while (a <= 100) {
         xA = (int) Math.pow(a,2);
         tA = tA + xA;
         a++;
     }
     while (b <= 100) {
         xB = xB + b;
         b++;
     }
     tB = (int) Math.pow(xB,2);
     difference = tB - tA;
     System.out.print(difference);
    }
}