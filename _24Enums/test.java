package _24Enums;

public class test {
    public static void main(String[] args) {
        System.out.println(manually.friday);

        day w = day.WEDNESDAY;
        System.out.println(w.name());
        System.out.println(w.ordinal());

        day en = day.valueOf("MONDAY");
        System.out.println(en);

        w.display();

        day d = day.SATURDAY;
        d.getHindi();

        switch (w){
            case FRIDAY -> System.out.println("F");
            case SATURDAY -> System.out.println("S");
            default -> System.out.println("Weekend");
        }
    }
}
