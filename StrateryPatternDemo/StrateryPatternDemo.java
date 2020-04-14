package StrateryPatternDemo;
public class StrateryPatternDemo
{
    public static void main(String args[]){
        Duck vit1 = new VitGioi();
        Duck vit2 = new RubberDuck();
        SQuack sq = new SQuack();
        vit1.SetFlyBehavior(new FlyByWings());
        vit1.SetQuackBehavior(sq);

        vit2.SetCanFlyBehavior(new CantFly());
        vit2.SetQuackBehavior(sq);
        System.out.println(vit1.Display());
        System.out.println(vit2.Display());
    }
}