import java.util.regex.*;

class Languages {

    public static void main(String[] args) {

        String text = "I love Java, Python, JavaScript and Go";

        Pattern p = Pattern.compile("Java|Python|JavaScript|Go");

        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}