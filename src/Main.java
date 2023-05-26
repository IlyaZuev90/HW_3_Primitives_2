public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int Deposit = 1100;
        int bonus = 100;

        if (Deposit > 1_000) {
            System.out.println("Баланс:" + " " + (initialBalance + Deposit + (Deposit / bonus)) + " " + "рублей");
        } else {
            System.out.println("Баланс:" + " " + (initialBalance + Deposit) + " " + "рублей");
        }

    }
}
