import java.util.*;

class RotateList {

    static <T> void rotate(List<T> list, int k) {

        int n = list.size();
        k = k % n;

        List<T> temp = new ArrayList<>();

        for (int i = k; i < n; i++) {
            temp.add(list.get(i));
        }

        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }

        list.clear();
        list.addAll(temp);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        rotate(list, 2);

        System.out.println(list);
    }
}