
/* Write a code to check if the number is divisible by both return both , if by one then retrun that number */
public class ifEflse {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int num = 100;
        if(num%a==0){
            if (num % b == 0) {
                System.out.println("Both");
            }
            else{
                System.out.println(a);
            }
        }
        else{
            if(num % b == 0){
                System.out.println(b);
            }
            else{
                System.out.println("None");
            }
        }
    }
}
