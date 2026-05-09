import java.util.*;
import java.util.stream.*;

class MethodRef2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("aman", "ravi", "neha");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}