package Level2;
import java.util.Scanner;

class VowelConsonantCount {
    static String check(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not";
    }

    static int[] count(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String r = check(s.charAt(i));
            if (r.equals("Vowel")) v++;
            else if (r.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] r = count(text);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
