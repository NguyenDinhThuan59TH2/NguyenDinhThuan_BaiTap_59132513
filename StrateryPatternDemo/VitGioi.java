package StrateryPatternDemo;

public class VitGioi extends Duck{
    @Override
    public String Display()
    {
        return "xin chao! vit gioi`comming in hottttttttt" + "\n"+performQuack()+
        "\n"+performFly();
    }
}