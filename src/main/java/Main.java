import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Deque<String> deque = new LinkedList<>();
        Map<String, String> map = new HashMap();

        list.add("Car");
        list.add("Bike");
        for(String s: list) { System.out.println(s); }

        set.add(1);
        set.add(2);
        for(Integer i: set){ System.out.println(i); }

        queue.offer("iPhone");
        queue.offer("Samsung");
        for(String s: queue) { System.out.println(s); }

        deque.addLast("Laptop");
        deque.addLast("PC");
        for(String s: deque) { System.out.println(s); }

        map.put("Laptop", "MacBook");
        map.put("Phone", "iPhone");
        System.out.println(map);


        list.removeAll(list);
        System.out.println(list);

        set.removeAll(set);
        System.out.println(set);

        for(String s: queue) { queue.poll(); }
        System.out.println(queue);

        for(String s: deque) { deque.removeLast(); }
        System.out.println(deque);

        Set<String> keys = new HashSet<>(map.keySet());
        for (String key : keys) {
            map.remove(key);
        }
        System.out.println(map);
    }
}
