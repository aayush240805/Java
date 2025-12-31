package _15Abstraction;

public abstract class vehicle {
//only can be accessed within this class
    // private abstract void accelerate();
    // private abstract void deaccelerate();
//can be accessed in this package and also can be overridden. But only if that subclass extending this class.
    // protected abstract void deaccelerate();


    //this methods will be extended by future(sub) class.
    public abstract void accelerate();
    public abstract void decelerate();
}

