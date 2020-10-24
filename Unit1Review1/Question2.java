class Question2 {
 public static void main (String[] args) {
     int a = 1;
     int b = 0;
     int x = 1;
     int t = 0;
     while (x <= 4000000) {
         x = a + b;
         b = a;
         a = x;
         if (x % 2 == 0) {
         t = t + x;
        }
     }
     System.out.print(t);
 }
}
