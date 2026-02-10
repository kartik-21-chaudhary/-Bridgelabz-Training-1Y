package Level3;
import java.util.Scanner;
class UniqueCharFrequency {

    static char[] uniqueCharacters(String s) {
        char[] temp = new char[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                temp[count++] = ch;
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    static String[][] findFrequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(s);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] output = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + "\t\t" + output[i][1]);
        }
    }
}

