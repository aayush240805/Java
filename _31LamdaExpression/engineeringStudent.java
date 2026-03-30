package _31LamdaExpression;

public class engineeringStudent implements student {
    @Override
    public String getBio(String name){
        return name + " is Engineering Student.";
    }
}
