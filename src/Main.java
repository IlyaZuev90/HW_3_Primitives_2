public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int firstTypeOfDeposit = 900;
        int secondTypeOfDeposit = 2_000;
        int bonus = 100;

        if (firstTypeOfDeposit > 1_000) {
            System.out.println("Баланс:" + " " + (initialBalance + firstTypeOfDeposit + (firstTypeOfDeposit / bonus)) + " " + "рублей");
        } else {
            System.out.println("Баланс:" + " " +(initialBalance + firstTypeOfDeposit) + " " + "рублей");
        }

        if (secondTypeOfDeposit > 1_000) {
            System.out.println("Баланс:" + " " + (initialBalance + secondTypeOfDeposit + (secondTypeOfDeposit / bonus)) + " " + "рублей");
        } else {
            System.out.println("Баланс:" + " " + (initialBalance + secondTypeOfDeposit) + " " + "рублей");
        }

    }
}
