package hashmapsandhashfunction.implementacustomhashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 56);
        map.put("two", 43);
        map.put("three", 34);
        // Display the hash map
        System.out.println(map.get("one"));
        System.out.println(map.get("two"));
        System.out.println(map.get("three"));

        map.remove("one");
        System.out.println(map.get("one"));
    }
}
