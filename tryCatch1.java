// import java.util.InputMismatchException;
import java.util.Scanner;

// public class Exceptions {
//     public static void main(String[] args) {
//         int arr[]= {12,25,78,1010};

//         int n1 = 70;
//         int n2 = 2;
//         int n3 = n1/n2;
//         int n4 = arr[15454541];
//         Scanner sc = new Scanner(System.in);
        
//         try{
//             int x = sc.nextInt();
            
//             System.out.println(n3);
//             System.out.println(n4);
//             System.out.println(x);
//         }
//         catch(ArithmeticException e){
//             System.out.println(e);
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e);
//         }catch(InputMismatchException e){
//             System.out.println(e);
//         }
//         sc.close();
//     }
// }

// class InvlaidAgeException extends Exception{
//     InvlaidAgeException(String msg){
//         super(msg);
//     }
// }
// public class Age {
//     public static void main(String[] args)throws InvlaidAgeException {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age<18){
//             throw new InvlaidAgeException("Minor");
//         }else{
//             System.out.println("Eligible for vote");
//         }
//     }
    
// }

// class InvlaidAgeException extends Exception{
//     InvlaidAgeException(String msg){
//         super(msg);
//     }
// }



class InvlaidBanksException extends Exception{
    InvlaidBanksException(String msg){
        super(msg);
    }
}
public class tryCatch1 {
    public static void main(String[] args)throws InvlaidBanksException {
        int funds = 10000;
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        sc.close();
        if(amount>funds){
            throw new InvlaidBanksException("Insufficient Funds");
        }else{
            System.out.println("Transaction Successfull!!!");
        }
        
    }
    
    
}
