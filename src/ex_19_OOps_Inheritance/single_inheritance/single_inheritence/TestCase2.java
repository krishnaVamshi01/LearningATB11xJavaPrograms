package ex_19_OOps_Inheritance.single_inheritance.single_inheritence;

public class TestCase2 extends CommonToAll {
    void runningTC2() {
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
