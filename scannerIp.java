import java.util.Scanner;
public class scannerIp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int Sum = n2 + n1;
        System.out.println(Sum);
        sc.close();
    }
}
