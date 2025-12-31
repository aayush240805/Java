package _9OOPs;

class car{
    private String brand;
    private String model;
    private int year;
    private int speed;

    void setbrand(String b){
        brand = b;
    }

    void setmodel(String m){
        model = m;
    }

    void setyear(int y){
        year = y;
    }

    void setspeed(int s){
        speed = s;
    }

    String getbrand(){
        return brand;
    }
    String getmodel(){
        return model;
    }
    int getyear(){
        return year;
    }
    int getspeed(){
        return speed;
    }

    void accelerate(int increment){
        speed += increment;
    }
    void brake(int decrement){
        speed -= decrement;
    }
}