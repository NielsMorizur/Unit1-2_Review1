class Question4 {
 public static void main (String[] args) {   
     int a = 1;
     while (a <= 1000) {
         for (int b = 1; b <= 1000; b++) {
             double c = (Math.sqrt(a*a + b*b));
             if (a+b+c == 1000){
                 System.out.println(a + " " + b + " " + c);
                 System.out.println("Product: " + (a*b*c));
             }
         }
         a++;
     }
 }
}