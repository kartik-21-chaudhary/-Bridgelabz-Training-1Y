import java.util.Scanner;
class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics marks:");
        int physics = sc.nextInt();
        System.out.println("Enter Chemistry marks:");
        int chemistry = sc.nextInt();
        System.out.println("Enter Maths marks:");
        int maths = sc.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        System.out.println("Average Marks: " + percentage);
        if (percentage >= 75) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Very Good");
        } else if (percentage >= 45) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Good");
        } else if (percentage >= 35) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Pass");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Fail");
        }
    }
}
