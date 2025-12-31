package _20InnerClasses_Member;

public class car2 {
    private String model;
    private boolean isEngineOn;

    public car2(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    public String getModel(){
        return model;
    }
    public boolean getIsEngineOn(){
        return isEngineOn;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setIsEngineOn(boolean isEngineOn){
        this.isEngineOn = isEngineOn;
    }
}

