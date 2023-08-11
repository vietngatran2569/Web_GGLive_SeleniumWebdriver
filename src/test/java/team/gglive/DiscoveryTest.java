package team.gglive;

import org.testng.annotations.Test;

public class DiscoveryTest extends Base_Config {

    String phoneInput = "0977000002";
    String pwInput = "abc123";

    @Test
    public void checkverifyText() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickKhampha();
        Discovery_Page discovery_Page = new Discovery_Page(driver);
        discovery_Page.checkVerifyText();
    }

    @Test
    public void checkClick_TabTatca() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickKhampha();
        Discovery_Page discovery_Page = new Discovery_Page(driver);
        discovery_Page.checkClickbtnTatCa();
    }

    @Test
    public void checkClick_TabGiaiTri() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickKhampha();
        Discovery_Page discovery_Page = new Discovery_Page(driver);
        discovery_Page.checkClickbtnGiaiTri();
    }

    @Test
    public void checkClick_TabMobileGame() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickKhampha();
        Discovery_Page discovery_Page = new Discovery_Page(driver);
        discovery_Page.checkClickbtnMobileGame();
    }

    @Test
    public void checkClick_TabPCGame() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickKhampha();
        Discovery_Page discovery_Page = new Discovery_Page(driver);
        discovery_Page.checkClickbtnPCGame();
    }
}
