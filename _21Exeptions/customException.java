package _21Exeptions;

public class customException extends Exception{
    public customException() {
        super("What do you want?, You don't have money.");
    }

    public void getAmount(){
        System.out.println("Le Dekh...");
    }
}
