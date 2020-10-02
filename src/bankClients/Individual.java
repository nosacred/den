package bankClients;

public class Individual extends Client {

    public Individual(double x) {
        super(x);
    }

    @Override
    public void info() {
        System.out.println("Комиссия за снятие средств отсутствует");
        System.out.println("Комиссия за пополнения счета до 1000р - 1%\n" +
                "Комиссия при пополнении счета  от 1000р включительно - 0.5 %");
        System.out.println("Баланс Вашего счета составляет" + getBalance() + " руб");
    }

    @Override
    public void putMoney(double amount) {
        double commission1 = 0.01;
        if (amount < 1000) {
            super.putMoney(amount - amount * commission1);
        } else {
            if (amount >= 1000) {
                double commission2 = 0.005;
                super.putMoney(amount - amount * commission2);
            }
        }
    }
}

