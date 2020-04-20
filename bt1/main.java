package bt1;

public class main {
    public static void main(String args []){
        Context ct = new Context();
        ct.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + ct.tinh(75,12));
        ct.setTinhToan(new Tru());
        System.out.print("57 - 78 = " + ct.tinh(54,78));
    }
}