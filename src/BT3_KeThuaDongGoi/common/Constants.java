package BT3_KeThuaDongGoi.common;

public class Constants {

    //  + Tạo class "Constants" lưu các thông tin dạng static: browser (String), report (boolean), headless (boolean)
    public static String browser = "Chrome";
    public static boolean report = true;
    public static boolean headless = false;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }
}

//- Tại package "common" :
//        + Tạo class "Constants" lưu các thông tin dạng static: browser (String), report (boolean), headless (boolean)
//        + Tạo class "BaseTest" để tạo hàm createDriver và closeDriver
//        - Tại package "testcases" :
//        + Tạo class "TestCases" để viết 2 TC: Login và Add Category từ https://cms.anhtester.com/login
//        Yêu cầu:	- Hàm createDriver hiển thị thông tin: Browser, Report, Headless
//        - Hàm closeDriver hiển thị thông tin "Closed browser: " + browser và truyền Browser vào
//        - 2 hàm TC từ class TestCases sẽ kế thừa lại class BaseTest và mỗi TC phải có thông tin createDriver và closeDriver
//	- Hàm TC tự viết các step theo ý mình tự nghiên cứu không cần hỏi lại. Dạng step in ra System.out.println("step...")
//            Note:	+ Hàm xây dựng và hàm get/set tương ứng để giải quyết bài toán theo yêu cầu (nếu có)
//            admin@example.com/123456
