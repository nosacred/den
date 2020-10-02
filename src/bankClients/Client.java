package bankClients;

public abstract class Client {

    private double balance;

    Client(double money){
        balance = Math.abs(money);
    }

    public double getBalance(){
        System.out.println("Остаток на Вашем счете составляет "+balance +" рублей");
        return balance;
    }

    public abstract void info();

    public void takeMoney(double amount) {
        balance-= Math.abs(amount);
    }

    public void putMoney(double amount) {
        balance+= Math.abs(amount);
    }
}
