package challenges.challenge13;

class Dice {
    int minNumber;
    int maxNumber;
    int currentNumber;

    Dice(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.currentNumber = -1;
    }

    int rollDice() {
        currentNumber = (int) (Math.random() * maxNumber) + this.minNumber;
        return currentNumber;
    }

    public static void main(String[] args) {
        Dice newDice = new Dice(1, 6);

        for (int i = 0; i < 20; i++) {
            System.out.print(newDice.rollDice()+", ");
        }
//        System.out.println(newDice.currentNumber);
    }
}
