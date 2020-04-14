package StrateryPatternDemo;
public class StrateryPatternDemo
{
    public static void main(String args[]){
        Duck vit1 = new VitGioi();
        vit1.SetFlyBehavior(new FlyByWings());
        vit1.SetQuackBehavior(new SQuack());
        System.out.println(vit1.Display());
    }
}