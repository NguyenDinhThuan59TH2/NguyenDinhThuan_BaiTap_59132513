package bt2;
import java.util.ArrayList;
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> DSnhanvien = new ArrayList<NhanVien>();
    @Override
    public void them(NhanVien nv)
    {
        DSnhanvien.add(nv);
    }
    public void inDS(){
        for (int i = 0; i < DSnhanvien.size() ; i++){
            System.out.println(i + 1 + ".");
            DSnhanvien.get(i).getthongtin();
        }
    }

}