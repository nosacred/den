package bankClients;

public class LegalEntity extends Client {

    public LegalEntity(double x){
        super(x);
    }


    @Override
    public void info() {
        System.out.println("Комиссия за снятие средств составляет 1% от суммы");
        System.out.println("Комиссия за пополнение счета отсутствует");
        System.out.println("Баланс Вашего счета составляет" + getBalance() + " руб");
    }

    @Override
    public void takeMoney(double amount) {
        double commission = 0.01;
        if (getBalance() >= amount + amount * commission) {
            super.takeMoney(amount + amount * commission);
        } else {
            System.out.println("На вашем счете недостаточно средств для выполнения данной операции!");
        }
    }
}
