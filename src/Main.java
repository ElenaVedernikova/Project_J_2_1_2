public class Main {
    public static void main(String[] args) {
        int balance = 100;              //начальный баланс счета
        int transferAmount = 1100;      //сумма перевода
        int transfer = 1000;            //сумма, свыше которой пополняется счет
        int bonusPrice = 100;           //стоимость 1 бонуса
        int bonus;
        int totalBalance;
        if (transferAmount > transfer) {
            bonus = transferAmount / bonusPrice;
        } else {
            bonus = 0;
        }
        totalBalance = balance + transferAmount + bonus;
        System.out.println("Total balance: " + totalBalance);
        System.out.println("Bonus: " + bonus);
    }
}
