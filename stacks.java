import java.util.*;
public class stacks {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack <>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        // System.out.println(s.peek());
        // s.pop();
        // System.out.println(s.peek());
        // for(int i : s){
        //     System.out.println(i);
        // }
         System.out.println(s.search(30));
    }
}
