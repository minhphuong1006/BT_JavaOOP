package BT2_phamvitruycap.person;

import java.util.Stack;

public class Person {
    //Tạo class "Person" với các thông tin: name, age, gender, address, phone
    private String name;
    private int age;
    private  String gender;
    private String address;
    private String phone;

    //Hàm xây dựng không có tham số
    public Person ()
    {
        name = "Phương";
        age = 20;
        address = "BÌnh định";
        gender = "Nữ";
        phone = "0336727019";

    }

    //Hàm xây dựng không có tham số
    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Các hàm get truy xuất thông tin
    public String getname()
    {
        return name;
    }

    public int getAge()
    {
        return  age;
    }
    public String getGender()
    {
        return gender;
    }

    protected String getAddress()
    {
        return  address;
    }
    protected String getPhone()
    {
        return  phone;
    }

    protected void getinfo()
    {
        System.out.println("Tên: " + getname());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Giới tính: " + getGender());
        System.out.println("Địa chỉ: " + getAddress());
        System.out.println("SDT" + getPhone());
    }

    public void getinfoCompanyClass()
    {
        System.out.println("Tên: " + getname());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Giới tính: " + getGender());
    }
}



/* BÀI TẬP PHẦN PACKAGE VÀ PHẠM VI TRUY CẬP
 - Tại package "person" :
 + Tạo class "Person" với các thông tin: name, age, gender, address, phone
 + Hàm xây dựng và hàm get tương ứng để giải quyết bài toán theo yêu cầu
 + Tạo class "Information" để gọi lại tất cả các thông tin từ class Person

- Tại package "company" :
 Yêu cầu:	+ Tạo class "Company" để gọi lại thông tin từ class Person: name, age, gender. Còn lại các thông tin khác không được hiển thị ra.	*/