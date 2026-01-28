import java.util.*;
public class grocery {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("milk");
        list.add("eggs");
        list.add("soap");
        list.add("facewash");
        list.add("perfume");
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        list.set(1,"almonds");
        list.remove(3);
        list.add("Sugar");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        

    }
}
