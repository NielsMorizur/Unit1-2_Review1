class Question1 {
 public static void main (String[] args) {
   int t = 0;
   int x = 999;  
   while (x > 0) {
       if (x % 3 == 0 || x % 5 == 0) {
           System.out.print(x + " ");
           t = t + x;
           x--;
        }else {
            x--;
        }
    }
   System.out.println("");
   System.out.println("Total: " + t);
 }   
}