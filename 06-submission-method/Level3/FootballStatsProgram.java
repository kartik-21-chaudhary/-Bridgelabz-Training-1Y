package Level3;

class FootballStatsProgram {

    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println(findMean(heights));
        System.out.println(findMin(heights));
        System.out.println(findMax(heights));
    }
}
