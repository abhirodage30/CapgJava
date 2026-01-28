/* Write a code to find AP series , where first number , diff , and nth number is given */

// public class ap {

//     public static void main(String[] args) {
//         int a = 8;
//         int n = 40;
//         int d = 4;
//         System.out.println(a);
//         int not = ((n-a)/d);
//         for(int i=0;i<not;i++){
//             System.out.println(a+d);
//             a = a+d;
//         }
//     }

// }


/* Write a code to find digits of a number also called as armstrong number */
public class numbers2{
    public static void main(String[] args) {
        int count = 0;
        int num = 120;
        while (num!=0) {
            num = num/10;
            count++;
            
        }
        System.out.println(count);
    }
}