import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Queue<String> queue = new PriorityQueue<>();
        Deque<String> deque = new ArrayDeque<>();
        Map<String, String> map = new HashMap();

        list.add("Car");
        list.add("Bike");
        for(String s: list) { System.out.println(s); }

        set.add(1);
        set.add(2);
        //System.out.println(set);
        for(Integer i: set){ System.out.println(i); }

        queue.add("iPhone");
        queue.add("Samsung");
        //System.out.println(queue);
        for(String s: queue) { System.out.println(s); }

        deque.add("Laptop");
        deque.add("PC");
        //System.out.println(deque);
        for(String s: deque) { System.out.println(s); }

        map.put("Laptop", "MacBook");
        map.put("Phone", "iPhone");
        System.out.println(map);


        list.removeAll(list);
        System.out.println(list);

        set.removeAll(set);
        System.out.println(set);

        queue.removeAll(queue);
        System.out.println(queue);

        deque.removeAll(deque);
        System.out.println(deque);


        Set keySet = map.keySet();
        Object[] keyArray = keySet.toArray();
        for (int i = 0; i < keyArray.length; i++) {
            map.remove(keyArray[i]);
        }
        System.out.println(map);
    }
}
