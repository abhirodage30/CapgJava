import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int c = 0;
        System.out.println("The Fibonacci Series is : ");
        if (n == 1) {
            System.out.println(0);
        }else if(n==2){
            System.out.println(0);
            System.out.println(1);
        }else{
            System.out.println(0);
            System.out.println(1);
            for(int i=2;i<n;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        }
        sc.close();

    }
}
