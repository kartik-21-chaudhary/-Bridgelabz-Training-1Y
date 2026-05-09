class MaxUtil {

    static <T extends Comparable<T>> T maximum(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}

class Main4 {

    public static void main(String[] args) {

        System.out.println(MaxUtil.maximum(3, 7, 5));
        System.out.println(MaxUtil.maximum(3.5, 2.1, 9.8));
    }
}