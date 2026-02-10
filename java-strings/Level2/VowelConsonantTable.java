package Level2;
import java.util.Scanner;

class VowelConsonantTable {
    static String check(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] build(String s) {
        String[][] a = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            a[i][0] = String.valueOf(s.charAt(i));
            a[i][1] = check(s.charAt(i));
        }
        return a;
    }

    static void display(String[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t" + a[i][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] r = build(text);
        display(r);
    }
}

