package main.singletonPattern.java;

public class TestSingleton {
    public static void main(String[] args){
        Singleton s1=Singleton.getInstance();
        s1.play();
        s1.displayNum();

        Singleton s2=Singleton.getInstance();
        s2.number=5;
        s2.displayNum();
        s1.displayNum();

    }

}
