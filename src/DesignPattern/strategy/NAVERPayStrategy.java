package DesignPattern.strategy;

public class NAVERPayStrategy implements PaymentStrategy{

    private String naverId;
    private String password;

    public NAVERPayStrategy(String naverId, String password) {
        this.naverId = naverId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " is paid using NAVERPay");
    }
}
