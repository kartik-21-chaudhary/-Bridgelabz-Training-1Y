import java.util.*;

class SymmetricDiff {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> result = new HashSet<>(s1);

        for (int i : s2) {
            if (!result.add(i)) {
                result.remove(i);
            }
        }

        System.out.println(result);
    }
}