public class Main {

    public static void main(String[] args) {

        int startAmount = 100;

        int addAmount = 1100;

        int bonus;

        if (addAmount > 1000) {
            bonus = addAmount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("your bonus - " + bonus);

        int totalAmount = startAmount + addAmount + bonus;

        System.out.println("total amount " + totalAmount);

    }
}