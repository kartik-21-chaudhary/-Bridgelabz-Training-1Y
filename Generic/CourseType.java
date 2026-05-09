abstract class CourseType {
}

class ExamCourse extends CourseType {
}

class AssignmentCourse extends CourseType {
}

class ResearchCourse extends CourseType {
}

class Course<T extends CourseType> {

    java.util.List<T> courses = new java.util.ArrayList<>();

    void add(T c) {
        courses.add(c);
    }

    static void show(java.util.List<? extends CourseType> list) {

        for (CourseType c : list) {
            System.out.println(c);
        }
    }
}

class Main14 {

    public static void main(String[] args) {

        Course<ExamCourse> c = new Course<>();

        c.add(new ExamCourse());

        Course.show(c.courses);
    }
}