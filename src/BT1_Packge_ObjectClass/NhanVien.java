package BT1_Packge_ObjectClass;

public class NhanVien {
    public String name;
    public int age;
    public String address;
    public String className;



    //Hàm xây dựng không có tham số
    public NhanVien ()
    {
        name = "Phương";
        age = 20;
        address = "BÌnh định";
        className = "Java OOP";


    }


}

//    BÀI TẬP PHẦN PACKAGE VÀ OBJECT, CLASS
//
//- Tạo project mới làm bài tập phần Java OOP
//- Tạo package để phân chia rõ ràng các bài tập cho phù hợp (tuỳ ý)
//- Tạo class NhanVien và các biến, hàm cho phù hợp để lưu lại thông tin nhân viên cơ bản (họ tên, tuổi,...)
//- Tạo class ThongTin để gọi lại thông tin nhân viên từ class NhanVien trên
