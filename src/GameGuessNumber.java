public class GameGuessNumber {

    public static void main(String[] args) {
        int computerNumber = 1 + (int) (Math.random() * 99);
        int playerNumber = 50;
        do {
            if (playerNumber > computerNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else if (playerNumber < computerNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }
        while (playerNumber != computerNumber);
        System.out.println("Загаданное число - " + computerNumber);
        System.out.println("Вы победили!");
    }
}
