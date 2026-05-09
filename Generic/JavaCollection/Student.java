import java.util.*;

class Student {

    String id;

    Student(String id) {
        this.id = id;
    }
}

class ExamSystem {

    public static void main(String[] args) {

        List<String> questions = new ArrayList<>();

        questions.add("Q1");
        questions.add("Q2");
        questions.add("Q3");

        Collections.shuffle(questions);

        Set<String> students = new HashSet<>();

        students.add("S1");
        students.add("S2");
        students.add("S1");

        Queue<Student> queue = new LinkedList<>();

        queue.add(new Student("S1"));
        queue.add(new Student("S2"));

        Stack<String> history = new Stack<>();

        while (!queue.isEmpty()) {

            Student s = queue.remove();

            for (String q : questions) {
                history.push(q);
            }

            System.out.println("Exam given by " + s.id);
        }
    }
}