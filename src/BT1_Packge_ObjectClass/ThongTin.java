package BT1_Packge_ObjectClass;

public class ThongTin {
    //- Tạo class ThongTin để gọi lại thông tin nhân viên từ class NhanVien trên
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Phương", 20, "Nữ", "10/06/1995", "Bình Định");
        nv1.getinfo();
        System.out.println("------------------------------------");
        NhanVien nv2 = new NhanVien("Thạch", 30, "Nam", "24/07/1995", "Bình Định");
        nv2.getinfo();
    }

}
