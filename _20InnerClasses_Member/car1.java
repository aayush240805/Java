package _20InnerClasses_Member;

public class car1 {
    private String model;
    private boolean isEngineOn;

    public car1(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    public class Engine{
        public void start(){
            if(!isEngineOn){
                System.out.println(model + " engine started.");
            }
            else{
                System.out.println(model + " engine is already ON.");
            }
        }

        public void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + " engine stopped.");
            }
            else{
                System.out.println(model + " engine is already stopped.");
            }
        }
    }
}

