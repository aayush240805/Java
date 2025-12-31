package _20InnerClasses_Local;

public class hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public hotel(String name, int totalRooms, int reservedRooms){
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        // local inner class to encapsulate the validation logic. And we have use this class here only once (local scope).
        // And this class can also access all the fields of enclosing class.
        class ReservationValidator{
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("guest name can't be empty.");
                    return false;
                }
                if(numOfRooms < 0){
                    System.out.println("no. of rooms should be +ve.");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("not enough rooms are available now.");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator rv = new ReservationValidator();
        if(rv.validate()){
            reservedRooms += numOfRooms;
            System.out.println("reservation confirmed for " + guestName + " for " + numOfRooms + " rooms.");
        }
        else{
            System.out.println("reservation failed!");
        }
    }
}

