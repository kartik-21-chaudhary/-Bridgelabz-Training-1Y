package Level3;
import java.util.Scanner;

class FrequencyNestedLoop {

    static String[] findFrequency(String text) {
        char[] ch = text.toCharArray();
        int[] freq = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0'; 
                }
            }
        }

        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0')
                count++;
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                result[index++] = ch[i] + " : " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] output = findFrequency(text);

        System.out.println("Character Frequency");
        for (String s : output) {
            System.out.println(s);
        }
    }
}
