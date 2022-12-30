package DesignPattern.strategy;

public class KAKAOPayStrategy implements PaymentStrategy{

    private String kakaoId;
    private String password;

    public KAKAOPayStrategy(String kakaoId, String password) {
        this.kakaoId = kakaoId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " is paid using KAKAOPay");
    }
}
