package StrateryPatternDemo;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    ICantFlyBehavior cantFlyBehavior;

    public Duck(){

    }
    public void SetFlyBehavior(IFlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void SetQuackBehavior(IQuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    public void SetCanFlyBehavior(ICantFlyBehavior cantFlyBehavior)
    {
        this.cantFlyBehavior = cantFlyBehavior;
    }

    public String swim() {
        return "Vit boi trong ao";
    }

    public String performQuack() {
        return quackBehavior.Quack();
    }

    public String performFly() {
        return flyBehavior.Fly();
    }

    public String performCantFly() {
        return cantFlyBehavior.CFly();
    }
    public abstract String Display();
}