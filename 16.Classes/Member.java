import java.time.*;
import java.util.*;

class Member {

    String name;
    LocalDate expiry;

    Member(String n, LocalDate e) {
        name = n;
        expiry = e;
    }

    public String toString() {
        return name;
    }
}

class ExpiryFilter {

    public static void main(String[] args) {

        List<Member> list = Arrays.asList(
                new Member("A", LocalDate.now().plusDays(10)),
                new Member("B", LocalDate.now().plusDays(40))
        );

        list.stream()
                .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
                .forEach(System.out::println);
    }
}