package bt1;
public class NhanVien {
    public String ten;
    public int tuoi;
    public String diachi;
    public Double luong;
    public int tonggiolam;

    public NhanVien(String ten, int tuoi, String diachi, Double luong, int tonggiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.tonggiolam = tonggiolam;
      }
    public void setten(String ten) 
    {
        this.ten = ten;
    }
    public String getten() 
    {
        return ten;
    }
    public void settuoi(int tuoi) 
    {
        this.tuoi = tuoi;
    }
    public int gettuoi() {
        return tuoi;
    }
    public String getdiachi() {
        return diachi;
    }
    public void setdiachi(String diachi) 
    {
        this.diachi = diachi;
    }

    public void setluong(double luong) 
    {
        this.luong = luong;
    }
    public double getluong() {
        return luong;
    }
    public void settonggiolam(int tonggiolam) {
        this.tonggiolam = tonggiolam;
    }
    public int gettonggiolam() {
        return tonggiolam;
    }
    public void getthongtin(){
        System.out.println("Ten nhan vien:" + ten);
        System.out.println("Tuoi nhan vien:" + tuoi);
        System.out.println("Dia chi :" + diachi);
        System.out.println("Luong nhan vien:" + luong);
        System.out.println("tong so gio lam:" + tonggiolam); 
        System.out.println("Tien thuong:" + tinhThuong());
        System.out.println("Tong luong + thuong:" + (luong + tinhThuong()));
    }
  
  public double tinhThuong(){
      if (tonggiolam < 100) 
          return 0;
      else if (100 <= tonggiolam && tonggiolam <200) 
          return luong*0.1;
      return luong*0.2;  
  }
          
}
