class CopyUtil {

    static void copyList(
            java.util.List<? super Number> dest,
            java.util.List<? extends Number> src) {

        for (Number n : src) {
            dest.add(n);
        }
    }
}

class Main7 {

    public static void main(String[] args) {

        java.util.List<Number> dest = new java.util.ArrayList<>();
        java.util.List<Integer> src = java.util.Arrays.asList(1, 2, 3);

        CopyUtil.copyList(dest, src);

        System.out.println(dest);
    }
}