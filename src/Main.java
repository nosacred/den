import bankClients.Client;
import bankClients.Individual;
import bankClients.LegalEntity;
import bankClients.Physycal;

public class Main {
    public static void main(String[] args) {

        Client ip = new Individual(1000);
        Client legal = new LegalEntity(5000);
        Client phisyc = new Physycal(3000);

        ip.getBalance();
        legal.getBalance();
        phisyc.getBalance();

        ip.putMoney(350);
        legal.takeMoney(500);
        phisyc.putMoney(100);

        ip.info();
        legal.info();
        phisyc.info();


//        BankAccount deposit1 = new DepositAccount(5000);
//        BankAccount card1 = new CardAccount(12300);
//
//        System.out.println(deposit1.getBalance());
//        System.out.println(card1.getBalance());
//        System.out.println(deposit1.sendMoney(card1, 1000));
//
//        card1.sendMoney(deposit1,-5345.54);
//        deposit1.putMoney(500);
//        deposit1.putMoney(-5000.67);
//        deposit1.takeMoney(-500);
//
//        System.out.println(deposit1.getBalance());
//        System.out.println(card1.getBalance());
//        System.out.println(deposit1.sendMoney(card1, 1000));
//
//        System.out.println(deposit1.getBalance());
//        System.out.println(card1.getBalance());
    }
}
