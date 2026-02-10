package Level2;
import java.util.Scanner;
class StudentResult {
    static int[][] generatePCM(int n) {
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                pcm[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return pcm;
    }

    static double[][] calculateValues(int[][] pcm) {
        double[][] data = new double[pcm.length][4];

        for (int i = 0; i < pcm.length; i++) {
            double total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3;
            double per = (total / 300) * 100;

            data[i][0] = total;
            data[i][1] = Math.round(avg * 100.0) / 100.0;
            data[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return data;
    }

    static char[] calculateGrade(double[][] data) {
        char[] grade = new char[data.length];

        for (int i = 0; i < data.length; i++) {
            double p = data[i][2];

            if (p >= 80) grade[i] = 'A';
            else if (p >= 70) grade[i] = 'B';
            else if (p >= 60) grade[i] = 'C';
            else if (p >= 50) grade[i] = 'D';
            else if (p >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        return grade;
    }

    static void display(int[][] pcm, double[][] data, char[] grade) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                pcm[i][0] + "\t" +
                pcm[i][1] + "\t" +
                pcm[i][2] + "\t" +
                (int)data[i][0] + "\t" +
                data[i][1] + "\t" +
                data[i][2] + "\t" +
                grade[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] pcm = generatePCM(n);
        double[][] values = calculateValues(pcm);
        char[] grade = calculateGrade(values);
        display(pcm, values, grade);
    }
}
