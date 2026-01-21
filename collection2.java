import java.util.*;

public class collection2 {
    public static void main(String[] args) throws Exception {
        // ArrayDeque<Integer> q = new ArrayDeque<>();
        // q.add(10);
        // q.add(90);
        // q.add(50);
        // q.add(20);

        // Iterate
        // for(int i : q){
        // System.out.println(i);
        // }

        // Remove
        // q.remove(50); // remove any
        // q.poll(); // rmove first

        // for(int i : q){
        // System.out.println(i);
        // }

        // Size
        // System.out.println(q.size());

        // remove all elements
        // q.clear();

        // check if empty
        // System.out.println(q.isEmpty());

        // Priority Queue
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min PQ
        // PriorityQueue<Integer> mpq = new PriorityQueue<>(Collections.reverseOrder());
        // // Max PQ

        // Hash Sets
        // HashSet<Integer> h = new HashSet<>();
        // Set<Integer> h2 = new HashSet<>();
        // LinkedHashSet<Integer> h1 = new LinkedHashSet<>();
        // TreeSet<Integer> h3 = new TreeSet<>();

        // Hash Maps
        HashMap<Integer,String> map = new HashMap<>();
        // Map<Integer,Integer> hh = new HashMap<>();

        // LinkedHashMap<Integer,Integer> hh1 = new LinkedHashMap<>();
        // HashMap<Integer,Integer> hhh = new LinkedHashMap<>();
        // Map<Integer,Integer> hhl = new LinkedHashMap<>();

        // TreeMap<Integer,Integer> hh4 = new TreeMap<>();
        // SortedMap<Integer,Integer> hh4 = new TreeMap<>();
        // Map<Integer,Integer> hh4 = new TreeMap<>();

        map.put(1, "Sonam");
        map.put(2, "Liza");
        map.put(3, "Ohm");
        // map.remove(2);
        // System.out.println(map.get(3));
        // System.out.println(map.containsKey(1));

        for (Map.Entry <Integer,String> i : map.entrySet()) {
            System.out.print(i.getKey() + " ");
            System.out.println(i.getValue());
        }


    }
}
