import java.util.*;

class InvertMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> result = new HashMap<>();

        for (String key : map.keySet()) {

            int value = map.get(key);

            if (!result.containsKey(value)) {
                result.put(value, new ArrayList<>());
            }

            result.get(value).add(key);
        }

        System.out.println(result);
    }
}