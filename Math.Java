public class Math {
    double weight;
    double height;

    public void setHeightAndWeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public static void main(String[] args) {
        // Create an instance of Math
        Math math = new Math();

        // Set height and weight using the instance method
        math.setHeightAndWeight(12.3, 14.5);
        math.setHeightAndWeight(5.7, 50)

        // Call the bmiCalculator method and print the result
        double bmiResult = bmiCalculator(math.weight, math.height);
        System.out.println("BMI: " + bmiResult);
    }

    public static double bmiCalculator(double weight, double height) {
        // Ensure height is not zero to avoid division by zero
        if (height != 0) {
            double bmi = weight / (height * height);
            return bmi;
        } else {
            System.out.println("Height must be greater than zero for BMI calculation.");
            return 0;  // You might want to handle this situation differently
        }
    }
}
