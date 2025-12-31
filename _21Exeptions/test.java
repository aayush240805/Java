package _21Exeptions;

public class test {
    public static void main(String[] args) {
        bankBalance b = new bankBalance(2000);
        try{
            b.withdraw(2001);
        } catch (customException e) {
            e.getAmount();
            System.out.println(e);
        }
    }
}
