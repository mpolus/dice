import java.util.Random;

public class Main {
    public static void main(String[] args) {
        rollSixDice();
        rollSixDice();
        rollSixDice();
        rollSixDice();
    }

    private static void rollSixDice() {
        Random random = new Random();
        System.out.print("6 dices roll: ");
        for (int i = 0; i < 6; i++){
            int roll = random.nextInt(6) + 1;
            System.out.print("Roll #" + (i + 1) + ": " + roll + " ");

        }
        System.out.println();
    }
}
