package Level2;

class RandomStatsProgram {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        double[] result = findAverageMinMax(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
