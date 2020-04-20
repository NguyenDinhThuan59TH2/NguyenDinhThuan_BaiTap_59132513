package bt2;

public class HangHoa {
    String tenHH;
    int gia;
    String moTa;
    public String getTen(){
        return tenHH;
    }
    public int getGia(){
        return gia;
    }
    public String getMoTa()
    {
        return moTa;
    }

    public HangHoa(String tenHH, int gia, String moTa){
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
}