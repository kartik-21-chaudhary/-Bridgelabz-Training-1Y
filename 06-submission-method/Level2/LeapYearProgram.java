package Level2;

import java.util.Scanner;

class LeapYearProgram {

    public static boolean isLeap(int year) {
        if (year < 1582) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeap(year));
    }
}
