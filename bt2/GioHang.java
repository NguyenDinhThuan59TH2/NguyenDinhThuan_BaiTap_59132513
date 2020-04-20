package bt2;

import java.util.ArrayList;
public class GioHang {
    private IThanhToan hinhthucTT;
    private ArrayList<HangHoa> HH;

    public void setHangHoas(ArrayList<HangHoa> HH){
        this.HH = HH;
    }
    public void setHinhThucThanhToan(IThanhToan hinhThucTT){
        this.hinhthucTT = hinhThucTT;
    }
    public double thanhToan(){
        int tong = 0;
        for(int i = 0; i< HH.size(); i++){
            tong+= HH.get(i).getGia();
        } 
        return hinhthucTT.thanhToan(tong);
    }
}