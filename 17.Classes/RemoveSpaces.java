class RemoveSpaces {

    public static void main(String[] args) {

        String text = "This   is   an   example";

        text = text.replaceAll("\\s+", " ");

        System.out.println(text);
    }
}