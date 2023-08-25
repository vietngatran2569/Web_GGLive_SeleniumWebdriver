package team.gglive;

import org.testng.annotations.Test;

public class GGDou_Test extends Base_Config {
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
        header_page.clickGGdou();
        GGDou_Page ggDou_page = new GGDou_Page(driver);
        ggDou_page.getTextHireme("Chơi cùng tôi");
    }

    @Test
    public void checkSelectFilterCategory() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickGGdou();
        Thread.sleep(4000);
        GGDou_Page ggDou_page = new GGDou_Page(driver);
        ggDou_page.clickbtnClose();
        ggDou_page.selectDanhmuc();
        Thread.sleep(4000);
        ggDou_page.setSelectTrochuyen();
        Thread.sleep(4000);
    }

    @Test
    public void checkSelectFilterStatusSanSang() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickGGdou();
        Thread.sleep(4000);
        GGDou_Page ggDou_page = new GGDou_Page(driver);
        ggDou_page.clickbtnClose();
        ggDou_page.setSelectTrangThai();
        Thread.sleep(4000);
        ggDou_page.setSelectSanSang();
        Thread.sleep(4000);
    }

    @Test
    public void checkSelectPlayer() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickGGdou();
        Thread.sleep(4000);
        GGDou_Page ggDou_page = new GGDou_Page(driver);
        ggDou_page.clickbtnClose();
        ggDou_page.setSelectTrangThai();
        Thread.sleep(4000);
        ggDou_page.setSelectSanSang();
        Thread.sleep(4000);
        ggDou_page.clickPlayertoHire(0);
        Thread.sleep(4000);
    }

    






}
