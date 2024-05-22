import java.util.Random;

public class TempSensor {
    private int[] tempArray = new int[] {45, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 85};

    // Method to generate a random number between the upper and lower bound of the array
    private int getRandomIndex() {
        Random rand = new Random();
        return rand.nextInt(tempArray.length);
    }

    // Method to simulate taking the temperature of the room
    public int takeTemp() {
        int randomIndex = getRandomIndex();
        return tempArray[randomIndex];
    }
}
