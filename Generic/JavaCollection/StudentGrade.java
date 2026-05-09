import java.util.*;

class StudentGrade {

    public static void main(String[] args) {

        Map<String, Double> map = new TreeMap<>();

        map.put("Aman", 80.0);
        map.put("Ravi", 70.0);

        map.put("Aman", 85.0);

        map.remove("Ravi");

        for (String s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }
    }
}