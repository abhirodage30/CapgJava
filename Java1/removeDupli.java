import java.util.*;

public class removeDupli {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(List.of(1,1,2,2,2,3,3,4,4,4));

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; 
                } else {
                    break;
                }
            }
        }

        for (int val : list) {
            System.out.println(val);
        }
    }
}
