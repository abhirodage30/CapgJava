import java.util.*;
public class map {

    public static void main(String[] args) {
        int arr [] = {5,4,5,4,5,9};
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for (int i =0;i<arr.length;i++) {
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);

    }
}