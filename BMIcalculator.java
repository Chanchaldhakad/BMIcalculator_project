import java.util.Scanner;
public class BMIcalculator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gender (male/female): ");
        String gender = scanner.next().toLowerCase();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (gender.equals("male")) {
            BMIMale(bmi);
        } else if (gender.equals("female")) {
            BMIFemale(bmi);
        } else {
            System.out.println("Invalid gender input.");
        }

        scanner.close();
    }

    public static void BMIMale(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }

    public static void BMIFemale(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 23.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 24 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}