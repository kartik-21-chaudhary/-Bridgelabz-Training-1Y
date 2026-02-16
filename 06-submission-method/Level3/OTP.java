package Level3;

class OTP {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean checkUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }
        System.out.println(checkUnique(otps));
    }
}
