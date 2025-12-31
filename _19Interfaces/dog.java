package _19Interfaces;

//not extends -> implements
public class dog implements animal {
    @Override
    public void eat(){
        System.out.println("Dog is eating.");
    }
    @Override
    public void sleep(){
        System.out.println("Dog is sleeping.");
    }
}