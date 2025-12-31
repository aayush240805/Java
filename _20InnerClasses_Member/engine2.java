package _20InnerClasses_Member;

public class engine2 {
    private car2 c2;

    public engine2(car2 c2){
        this.c2 = c2;
    }

    public void start(){
        if(!c2.getIsEngineOn()){
            System.out.println(c2.getModel() + " engine started.");
        }
        else{
            System.out.println(c2.getModel() + " engine is already ON.");
        }
    }
    public void stop(){
        if(c2.getIsEngineOn()){
            c2.setIsEngineOn(false);
            System.out.println(c2.getModel() + " engine stopped.");
        }
        else{
            System.out.println(c2.getModel() + " engine is already stopped.");
        }
    }
}

