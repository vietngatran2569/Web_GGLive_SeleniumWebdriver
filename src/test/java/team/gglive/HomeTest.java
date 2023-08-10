package team.gglive;

import org.testng.annotations.Test;

public class HomeTest extends Base_Config {
    String phoneInput = "0977000002";
    String pwInput = "abc123";

    @Test
    public void check_trangchu_da_login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Home_Page homePage = new Home_Page(driver);
        homePage.clickTrangchu();
        Thread.sleep(4000);
        homePage.check_display_parent_category();
    }

    @Test
    public void check_trangchu_chua_login() throws InterruptedException {
        Home_Page homePage = new Home_Page(driver);
        homePage.clickTrangchu();
        Thread.sleep(4000);
        homePage.check_display_btn_chat_not_login();
        Thread.sleep(4000);
    }

    @Test
    public void check_click_footer_trangchu() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Home_Page homePage = new Home_Page(driver);
        homePage.clickTrangchu();
        Thread.sleep(4000);
        Footer_Page footer_Page = new Footer_Page(driver);
        footer_Page.clickDieuKhoan();
        footer_Page.clickLienHe();
        footer_Page.clickQuyenRiengTu();
        footer_Page.clickCamnang();
        footer_Page.clickUngdung();
    }

    @Test
    public void check_click_qr_code() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Home_Page homePage = new Home_Page(driver);
        homePage.clickTrangchu();
        homePage.check_click_qr_code();
    }

    @Test
    public void check_click_search() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickSearch("hi");
    }

    @Test
    public void check_click_nap_gcoin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickNapgcoin();
    }

    @Test
    public void check_click_icon_noti() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickIconNoti();
    }    

    @Test
    public void check_click_createStream() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickCreateStream();
    }    

}
