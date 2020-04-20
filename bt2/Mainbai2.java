package bt2;

import java.util.ArrayList;

public class Mainbai2 {
    private static void inDS(ArrayList<HangHoa> dsHH, IThanhToan iThanhToan){
        GioHang gioHang = new GioHang();
        gioHang.setHinhThucThanhToan(iThanhToan);
        gioHang.setHangHoas(dsHH);
        int tongCong = 0;
        System.out.println("Gio hang");
        for(int i = 0; i< dsHH.size();i++)
        {
            System.out.println("Ten SP: "+dsHH.get(i).getTen()+".");
            System.out.println("Gia: "+dsHH.get(i).getGia()+".");
            System.out.println("Mo ta sp: "+dsHH.get(i).getMoTa()+".");
            tongCong += dsHH.get(i).getGia();
        }
        System.out.println("Tong hoa don: "+tongCong);
        System.out.println("So tien can thanh toan: " + gioHang.thanhToan());
    }
    public static void main(String[] args) {
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();
        ThanhToanOnline thanhToanOnline = new ThanhToanOnline();

        HangHoa hangHoa1 = new HangHoa("001", 230000, "nuoc rua chen 10L");
        HangHoa hangHoa2 = new HangHoa("002", 45000, "khau trang 4 lop sl 10 cai");
        HangHoa hangHoa3 = new HangHoa("003", 480000, "quan jean Viet Nhat");
        HangHoa hangHoa4 = new HangHoa("004", 320000, "chao chong dinh BigC");
        HangHoa hangHoa5 = new HangHoa("005", 24000, "banh trang nhung nuoc - goi 40 cai");

        ArrayList<HangHoa> dHangHoas1 = new ArrayList<>();
        ArrayList<HangHoa> dHangHoas2 = new ArrayList<>();
        dHangHoas1.add(hangHoa1);
        dHangHoas1.add(hangHoa2);
        dHangHoas1.add(hangHoa3);

        dHangHoas2.add(hangHoa4);
        dHangHoas2.add(hangHoa5);
        dHangHoas2.add(hangHoa3);

        inDS(dHangHoas2, thanhToanCOD);
        System.out.println("---------------");
        inDS(dHangHoas1, thanhToanOnline);  
    }
}