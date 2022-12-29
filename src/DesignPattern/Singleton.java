package DesignPattern;

public class Singleton{
    private static class SingletonInstanceHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){};
    //synchronized 스레드 동기화
    public static synchronized Singleton getInstance(){
        return SingletonInstanceHolder.INSTANCE;
    }
}
