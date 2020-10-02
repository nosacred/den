package bankClients;

public class Physycal extends Client {

    public Physycal(double x){
        super(x);
    }

    @Override
    public void info() {
        System.out.println("Комиссия за пополнение и снятие средств отсутствует");
        System.out.println("Баланс Вашего счета составляет" + getBalance()+ " руб");
    }
}
