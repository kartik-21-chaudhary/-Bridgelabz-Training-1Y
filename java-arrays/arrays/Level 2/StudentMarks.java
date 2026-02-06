import java.util.Scanner;
class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            if (p < 0 || c < 0 || m < 0) {
                i--;
                continue;
            }
            phy[i] = p;
            chem[i] = c;
            math[i] = m;
            percent[i] = (p + c + m) / 3.0;
            if (percent[i] >= 90)
                grade[i] = 'A';
            else if (percent[i] >= 75)
                grade[i] = 'B';
            else if (percent[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }
        for (int i = 0; i < n; i++)
            System.out.println(phy[i] + " " + chem[i] + " " + math[i] + " " + percent[i] + " " + grade[i]);
    }
}
