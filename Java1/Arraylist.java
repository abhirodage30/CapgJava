import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        // List<Integer> l1 = new ArrayList<>();
        a1.add(60);
        a1.add(91);
        a1.add(84);
        a1.add(122);
        // a1.remove(2);
        // System.out.println(a1.get(0));
        a1.set(2,90);
        // System.out.println(a1.get(2));
        System.out.println(a1.indexOf(122));
    }
}
