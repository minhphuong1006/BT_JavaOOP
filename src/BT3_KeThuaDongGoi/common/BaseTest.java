package BT3_KeThuaDongGoi.common;

public class BaseTest {
     //+ Tạo class "BaseTest" để tạo hàm createDriver và closeDriver

    //- Hàm createDriver hiển thị thông tin: Browser, Report, Headless
    public void createDriver()
    {
        System.out.println("Open Browser: " + Constants.browser);
        System.out.println("Open Report: " + Constants.report);
        System.out.println("Headless Mode: " + Constants.headless);
    }

    //- Hàm closeDriver hiển thị thông tin "Closed browser: " + browser
    public void closeDriver()
    {
        System.out.println("Closed browser: " + Constants.browser);
    }

    //- Hàm closeDriver hiển thị thông tin "Closed browser: " và truyền Browser vào
    public void closeDriver(String browser)
    {
        System.out.println("Closed browser: " + browser);
    }

    public static void main(String[] args) {
        BaseTest bs = new BaseTest();
        bs.createDriver();
        bs.closeDriver();

    }
}
