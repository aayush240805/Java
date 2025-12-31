package _20InnerClasses_Static;

public class computer {
    private String brand;
    private String model;

    private OperatingSystem os;

    public computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOS(){
        return os;
    }

    public class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model" + model + ", OS" + osName);
        }
    }

    //It is the part of the class.
    public static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void displayUSB(){
            System.out.println("USB Type : " + type);
        }
    }
}

