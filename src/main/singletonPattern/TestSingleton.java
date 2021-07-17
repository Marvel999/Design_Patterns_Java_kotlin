package main.singletonPattern;

public class TestSingleton {
    public static void main(String[] args){
        Singleton s1=Singleton.getInstance();
        s1.play();
    }

}
