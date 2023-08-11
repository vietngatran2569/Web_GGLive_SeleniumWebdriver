package team.gglive;

import org.testng.annotations.Test;

public class BXH_Test extends Base_Config {
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
        header_page.clickBxh();
        BXH_Page bxh_Page = new BXH_Page(driver);
        bxh_Page.checkVerifyText();
    }

    @Test
    public void checkclickTabGame() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickBxh();
        BXH_Page bxh_Page = new BXH_Page(driver);
        bxh_Page.clickTabGame();
        bxh_Page.clickTheoNgay();
        bxh_Page.clickTheoThang();
    }

    @Test
    public void checkclickTabGiaiTri() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickBxh();
        BXH_Page bxh_Page = new BXH_Page(driver);
        bxh_Page.clickTabGiaiTri();
        bxh_Page.clickTheoNgay();
        bxh_Page.clickTheoThang();
    }

    @Test
    public void checkclickTabGGDou() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickBxh();
        BXH_Page bxh_Page = new BXH_Page(driver);
        bxh_Page.clickTabGGDuo();
        bxh_Page.clickTheoNgay();
        bxh_Page.clickTheoThang();
    }

}
