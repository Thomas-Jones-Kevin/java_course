// import java.util.*;
//List
// public class Main {
//     public static void main(String[] args) {
//         List<String> arrayList = new ArrayList<>();
//         List<String> linkedList = new LinkedList<>();

//         arrayList.add("Apple");
//         arrayList.add("Banana");
//         arrayList.add("Cherry");
//         arrayList.remove(2);
//         arrayList.set(1,"boobs");
//         System.out.println("ArrayList: " + arrayList);
        
//         linkedList.add(0,"Dog");
//         linkedList.add(1, "Elephant");
//         linkedList.add(2, "Cat");
//         linkedList.add(3,"lion");
//         linkedList.remove(0);
//         System.out.println("LinkedList: " + linkedList);
//     }
// }


// import java.util.*;
// //Set
// public class Main {
//     public static void main(String[] args) {
//         Set<Integer> hashSet = new HashSet<>();
//         Set<Integer> linkedHashSet = new LinkedHashSet<>();
//         Set<Integer> treeSet = new TreeSet<>();

//         hashSet.add(1); hashSet.add(2); hashSet.add(1);hashSet.add(5);hashSet.add(3); 
//         linkedHashSet.add(3); linkedHashSet.add(1); linkedHashSet.add(2);linkedHashSet.add(5);
//         treeSet.add(3); treeSet.add(1); treeSet.add(2);treeSet.add(5);treeSet.remove(2);

//         System.out.println("HashSet: " + hashSet);           // Unordered
//         System.out.println("LinkedHashSet: " + linkedHashSet); // Insertion order
//         System.out.println("TreeSet: " + treeSet);           // Sorted order
//     }
// }

// import java.util.*;
// //Map
// public class Main {
//     public static void main(String[] args) {
//         Map<String, Integer> hashMap = new HashMap<>();
//         Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//         Map<String, Integer> treeMap = new TreeMap<>();

//         hashMap.put("Zebra", 5); hashMap.put("Apple", 10);
//         linkedHashMap.put("Zebra", 5); linkedHashMap.put("Apple", 10);
//         treeMap.put("Zebra", 5); treeMap.put("Apple", 10);

//         System.out.println("HashMap: " + hashMap);           // Unordered
//         System.out.println("LinkedHashMap: " + linkedHashMap); // Insertion order
//         System.out.println("TreeMap: " + treeMap);           // Sorted by key

//         System.out.println("Contains key 'Apple': " + treeMap.containsKey("Apple"));
//         System.out.println("Value for 'Zebra': " + treeMap.get("Zebra"));
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Queue<String> queue = new LinkedList<>();
//         Queue<Integer> priorityQueue = new PriorityQueue<>();

//         queue.add("First");
//         queue.add("Second");
//         System.out.println("Queue peek: " + queue.peek());
//         //System.out.println("Queue poll: " + queue.poll());
//         System.out.println("Queue: " + queue);

//         priorityQueue.add(3); priorityQueue.add(1); priorityQueue.add(2);
//         System.out.println("PriorityQueue: " + priorityQueue); // Min-heap
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Stack<String> stack = new Stack<>();
//         stack.push("Red");
//         stack.push("Green");
//         stack.push("Blue");
//         System.out.println("Top: " + stack.peek());
//         stack.pop();
//         System.out.println("Stack: " + stack);
//     }
// }
// enum Level {
//     LOW(1), MEDIUM(2), HIGH(8);

//     private int code;

//     Level(int code) {
//         this.code = code;
//     }

//     public int getCode() {
//         return this.code;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Level l = Level.HIGH;
//         System.out.println("Level: " + l);           // Output: HIGH
//         System.out.println("Level Code: " + l.getCode()); // Output: 3
//     }
// }

enum OrderStatus {
    PLACED, SHIPPED, DELIVERED, CANCELLED
}

public class Main {
    OrderStatus status;

    Main(OrderStatus status) {
        this.status = status;
    }

    void checkStatus() {
        if (status == OrderStatus.DELIVERED) {
            System.out.println("Order completed!");
        } else {
            System.out.println("Current status: " + status);
        }
    }

    public static void main(String[] args) {
        Main o = new Main(OrderStatus.PLACED);
        o.checkStatus();
    }
}
