package _16AccessModifiers_Protected;

public class animal {
    private String name;
    protected String sound;

    public animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name + "-> makes sound like-> " + sound);
    }

    protected void changeSound(String newSound){
        this.sound = newSound;
    }
}

