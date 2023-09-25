package BT1_Packge_ObjectClass;

public class NhanVien {

    //Tạo class NhanVien và các biến
    public String name;
    public int age;
    public String gender;
    public String birthday;
    public String address;


    //Hàm xây dựng không có tham số
//    public NhanVien ()
//    {
//        name = "Phương";
//        age = 20;
//        gender = "Nữ";
//        address = "BÌnh định";
//        birthday = "10/06/1995";
//
//
//    }

    //Hàm xây dựng có tham số  //hàm cho phù hợp để lưu lại thông tin nhân viên cơ bản (họ tên, tuổi,...)
    public NhanVien(String name, int age, String gender, String birthday, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    //Hàm lưu lại thông tin
    public void getinfo()
    {
        System.out.println("Tên: " + getName());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Giới tính" + getGender());
        System.out.println("NTNS" + getBirthday());
        System.out.println("Địa chỉ: " + getAddress());
    }

}

//    BÀI TẬP PHẦN PACKAGE VÀ OBJECT, CLASS
//
//- Tạo project mới làm bài tập phần Java OOP
//- Tạo package để phân chia rõ ràng các bài tập cho phù hợp (tuỳ ý)
//- Tạo class NhanVien và các biến, hàm cho phù hợp để lưu lại thông tin nhân viên cơ bản (họ tên, tuổi,...)
//- Tạo class ThongTin để gọi lại thông tin nhân viên từ class NhanVien trên
