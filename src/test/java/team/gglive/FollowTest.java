package team.gglive;

import org.testng.annotations.Test;

public class FollowTest extends Base_Config {

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
        Follow_Page follow_Page = new Follow_Page(driver);
        follow_Page.checkverifyText();
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
        Follow_Page follow_Page = new Follow_Page(driver);
        follow_Page.clickTabTatca();
    }

    @Test
    public void checkClick_TabKenhDangTrucTiep() throws InterruptedException {
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
        Follow_Page follow_Page = new Follow_Page(driver);
        follow_Page.clickTabKenhdangtructiep();
    }

    @Test
    public void checkClick_TabLivestream() throws InterruptedException {
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
        Follow_Page follow_Page = new Follow_Page(driver);
        follow_Page.clickTabLivestream();
    }

    @Test
    public void checkClick_TabVideo() throws InterruptedException {
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
        Follow_Page follow_Page = new Follow_Page(driver);
        follow_Page.clickTabVideo();
    }

       @Test
    public void checkClick_TabKenhNgoaiTuyen() throws InterruptedException {
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
        Follow_Page follow_Page = new Follow_Page(driver);
        follow_Page.clickTabKenhngoaituyen();
    }

       @Test
    public void checkClick_TabDanhMuc() throws InterruptedException {
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
        Follow_Page follow_Page = new Follow_Page(driver);
        follow_Page.clickTabDanhmuc();
    }
}
