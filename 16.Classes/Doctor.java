import java.util.*;

class Doctor {

    String name;
    String day;
    String specialty;

    Doctor(String n, String d, String s) {
        name = n;
        day = d;
        specialty = s;
    }

    public String toString() {
        return name + " " + specialty;
    }
}

class DoctorFilter {

    public static void main(String[] args) {

        List<Doctor> list = Arrays.asList(
                new Doctor("A", "Saturday", "Cardio"),
                new Doctor("B", "Monday", "Neuro"),
                new Doctor("C", "Sunday", "Ortho")
        );

        list.stream()
                .filter(d -> d.day.equals("Saturday") || d.day.equals("Sunday"))
                .sorted((a, b) -> a.specialty.compareTo(b.specialty))
                .forEach(System.out::println);
    }
}