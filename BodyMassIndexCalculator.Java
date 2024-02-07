import java.util.Scanner;

public class Main {
    private double weight;
    private double height;

    public static void main(String[] args) {
        Main main = new Main();
        main.inputWeightAndHeight();
        main.calculateBMI();
    }

    public void inputWeightAndHeight() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your weight (in kilograms): ");
        weight = userInput.nextDouble();

        System.out.print("Enter your height (in meters): ");
        height = userInput.nextDouble();

        // Consume the newline character left by nextDouble()
        userInput.nextLine();
    }

    public void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        double bodyMassIndex = weight / (height * height);

        System.out.println("Your Body Mass Index (BMI): " + bodyMassIndex);
    }
}
