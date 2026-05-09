class SumUtil {

    static double sumNumbers(java.util.List<? extends Number> list) {

        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }
}

class Main6 {

    public static void main(String[] args) {

        java.util.List<Integer> l1 = java.util.Arrays.asList(1, 2, 3);
        java.util.List<Double> l2 = java.util.Arrays.asList(1.5, 2.5);

        System.out.println(SumUtil.sumNumbers(l1));
        System.out.println(SumUtil.sumNumbers(l2));
    }
}