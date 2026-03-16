class Student {
    String name;
    int roll;
    int marks;
    Student(String n, int r, int m) {
        name = n;
        roll = r;
        marks = m;
    }
    void grade() {
        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks >= 75)
            System.out.println("Grade B");
        else if(marks >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
    void display() {
        System.out.println(name + " " + roll + " " + marks);
        grade();
    }
    public static void main(String[] args) {
        Student s = new Student("Rahul",101,82);
        s.display();
    }
}