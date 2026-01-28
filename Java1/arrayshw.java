import java.util.Scanner;

public class arrayshw {
    public static void main(String[] args) {
        int num = 7;
        int arr[] = new int[num];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("The elemnents of arrayb are :");
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}
