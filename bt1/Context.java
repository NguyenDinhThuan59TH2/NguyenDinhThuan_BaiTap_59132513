package bt1;

public class Context {
    private Itinh tinhtoan;
	public void setTinhToan(Itinh tinhtoan){
        this.tinhtoan = tinhtoan;
    }
    public float tinh(float a, float b){
        return tinhtoan.tinh(a, b);
    }
}