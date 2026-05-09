import java.util.*;

class MethodRef1 {

    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(101, 102, 103);

        ids.forEach(System.out::println);
    }
}