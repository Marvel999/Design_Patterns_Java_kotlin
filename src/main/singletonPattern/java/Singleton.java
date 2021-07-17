package main.singletonPattern.java;

public class Singleton {

    private static Singleton singleton=null;
       int number=0;

    private Singleton(){
        System.out.println("Constructor");
    }

    public static Singleton getInstance(){
        if(singleton==null){
         singleton=new Singleton();
         return singleton;
        }else{
            return singleton;
        }
    }

    public static void play(){
        System.out.println("I am playing");
    }

    public void displayNum(){
        System.out.println(""+number);
    }

}
