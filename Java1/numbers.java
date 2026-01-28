/* Write a code to check if the number is divisible by both return both , if by one then retrun that number */



public class numbers {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter num : ");
    //     int num = sc.nextInt();
    //     System.out.println("Enter a : ");
    //     int a = sc.nextInt();
    //     System.out.println("Enter b : ");
    //     int b = sc.nextInt();

    //     if (num % a == 0) {
    //         if (num % b == 0) {
    //             System.out.println("Both");
    //         } else {
    //             System.out.println(a);
    //         }
    //     } else {
    //         if (num % b == 0) {
    //             System.out.println(b);
    //         } else {
    //             System.out.println("None");
    //         }
    //     }
    //     sc.close();
    // }

    /* Write a code to find factor of each element present in array*/
    public static void main(String[] args) throws Exception {
        int[] arr = {2,6,3,7,9};
        // System.out.println(arr[3]);
        for(int i=0;i<arr.length;i++){
            System.out.print("Factors of " + arr[i] + " are : ");
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    
                    System.out.print(arr[j] + ",");
                }
            }
            System.out.println();
        }
    }
}

/* Write a code to find sum of vertices of 2d matrix */

