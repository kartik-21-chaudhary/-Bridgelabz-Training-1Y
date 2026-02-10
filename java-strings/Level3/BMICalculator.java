package Level3;
import java.util.Scanner;

class BMICalculator {

    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(data[i][1]); // height
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    static void display(String[][] arr) {
        System.out.println("Height(cm)\tWeight\tBMI\tStatus");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                arr[i][0] + "\t\t" +
                arr[i][1] + "\t" +
                arr[i][2] + "\t" +
                arr[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble(); // weight
            hw[i][1] = sc.nextDouble(); // height
        }

        String[][] result = calculateBMI(hw);
        display(result);
    }
}

