package BT3_KeThuaDongGoi.testcases;

import BT3_KeThuaDongGoi.common.BaseTest;

public class TestCases extends BaseTest {

    public void TC1Login()
    {

        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login");
        System.out.println("Enter Email and Password");
        System.out.println("Click login button");
        System.out.println("Verify Redirect to Admin page");
        closeDriver();
    }
    public void  TC2AddCategory()
    {
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login");
        System.out.println("Enter Email and Password");
        System.out.println("Click login button");
        System.out.println("Verify Redirect to Admin page");

        System.out.println("Click on the Product menu");
        System.out.println("Click on the Category menu");
        System.out.println("Click on the Add new Category button");
        System.out.println("Enter all fields on the form create new category");
        System.out.println("Click on the Save button");
        System.out.println("Verify add new Category successfully");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testcases = new TestCases();
        testcases.TC1Login();
        System.out.println("===============================");
        testcases.TC2AddCategory();
    }

}

//- 2 hàm TC từ class TestCases sẽ kế thừa lại class BaseTest và mỗi TC phải có thông tin createDriver và closeDriver
//- Hàm TC tự viết các step theo ý mình tự nghiên cứu không cần hỏi lại. Dạng step in ra System.out.println("step...")
