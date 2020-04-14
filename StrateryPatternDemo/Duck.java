package StrateryPatternDemo;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck(){

    }
    public void SetFlyBehavior(IFlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void SetQuackBehavior(IQuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    public String swim(){
        return "Vit boi trong ao";
    }
    public String performQuack(){
        return quackBehavior.Quack();
    }
    public String performFly(){
        return flyBehavior.Fly();
    }
    public abstract String Display();
}