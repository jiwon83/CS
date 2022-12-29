import DesignPattern.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton one = Singleton.getInstance(); //생성자가 아니라, getInstance()를 통해 인스턴스를 할당.
        Singleton two = Singleton.getInstance();
        System.out.println(one.hashCode()==two.hashCode());

    }
}