public class palindrome {
    public static void main(String[] args) {
        String str = "abb";
        int n = str.length();
        int i=0;
        int j = n-1;
        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                System.out.println("Not a palindrome.");
                break;
            }
            System.out.println("Is a palindrome");
            break;
        }
    }
}
