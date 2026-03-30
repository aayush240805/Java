package _24Enums;

public enum day {
    MONDAY("SOMVAR"), TUESDAY("MANGALVAR"), WEDNESDAY("BUDHVAR"), THURSDAY("GURUVAR"), FRIDAY("SUKRVAR"), SATURDAY("SANIVAR"), SUNDAY("RAVIVAR");

    private String hindi;
    day(String hindi){
        this.hindi = hindi;
    }

    public void getHindi(){
        System.out.println(this.hindi);
    }

    public void display(){
        System.out.println("Today is " + this.name());
    }
}
