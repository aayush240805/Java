package _21Exeptions;



public class nullPointer {

    public static class student{
        public String name;
        public int id;
    }

    public static void main(String[] args) {
        try{
            student s = null;
            s.name = null;

            System.out.println(s.name);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
}

