package _19Interfaces;

//not extends -> implements
public class cat implements animal {
    @Override
    public void eat(){
        System.out.println("Cat is eating.");
    }
    @Override
    public void sleep(){
        System.out.println("Cat is sleeping.");
    }

}
