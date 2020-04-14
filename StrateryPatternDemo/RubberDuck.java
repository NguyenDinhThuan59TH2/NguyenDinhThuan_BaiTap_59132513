package StrateryPatternDemo;

public class RubberDuck extends Duck{
    @Override
    public String Display()
    {
        return "xin chao! Vit cao su comming in hottttttttt" + "\n"+performQuack()+
        "\n"+performCantFly();
    }

}