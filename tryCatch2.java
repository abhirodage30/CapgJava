// public class tryCatch2 {
//     public static void main(String[] args) {
//             int n1 = 5;
//             int n2 = 0;
           
//         try{
//              int s = n1/n2;
//              System.out.println(s);
//         }catch(ArithmeticException e){
            
//             System.out.println(e);
//         }
//         finally{
//             System.out.println(3);
//         }
//     }
// }

// prog to find sum of two numbers

public class tryCatch2{
   public static int division(int a,int b) {
    try {
        int r = a/b;
        return r;
    } catch (Exception e) {
        System.out.println(e);
    }
    finally{
        System.out.println("9999999");
    }
    return -1;
   }
   public static void main(String[] args) {
    int ans =division(134, 2);
    System.out.println(ans);
   }
    
}
