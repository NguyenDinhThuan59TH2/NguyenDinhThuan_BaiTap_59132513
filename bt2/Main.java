package bt2;

public class Main {
    public static void main (String args []){
        NhanVien nhanvien1 = new NhanVien("Nguyen Dinh Thuan",21, "Quang Nam", 2500000, 51);
        NhanVien nhanvien2 = new NhanVien("Tran Dinh Trong",21, "Quang Ngai",  2500000, 51);
        NhanVien nhanvien3 = new NhanVien("Le Van Tien ",21, "Phu Yen", 2500000, 51);
        NhanVien nhanvien4 = new NhanVien("Hoang Tan Hoang",21, "Phu Yen", 2500000, 51);
        NhanVien nhanvien5 = new NhanVien("Nguyen Van Thuan",21, "Quang Tri", 2500000, 51);

        QuanLyNhanVien qLyNhanVien = new QuanLyNhanVien();
        qLyNhanVien.them(nhanvien1);
        qLyNhanVien.them(nhanvien2);
        qLyNhanVien.them(nhanvien3);
        qLyNhanVien.them(nhanvien4);
        qLyNhanVien.them(nhanvien5);
        qLyNhanVien.inDS();
    }
}