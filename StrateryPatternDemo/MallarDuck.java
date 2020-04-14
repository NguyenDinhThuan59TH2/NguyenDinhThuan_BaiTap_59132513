package StrateryPatternDemo;

public class MallarDuck extends Duck{
    public MallarDuck()
    {

    }
    @Override
    public String Display(){
        return "xin chao! vit co xanh is comming" + "\n"+performQuack()+
        "\n"+performFly();
    }
}