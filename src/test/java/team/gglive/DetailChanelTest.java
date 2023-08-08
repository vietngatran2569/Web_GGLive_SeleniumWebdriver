package team.gglive;

import org.testng.annotations.Test;

public class DetailChanelTest extends Base_Config{

    String phoneInput = "0977000002";
    String pwInput = "abc123";
    @Test
    public void follow_user() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(8000);
        driver.get("https://stg.gglive.vn/channel/suzy-de-thu-o-ngggg/51963834507726848");
        Thread.sleep(8000);
        DetailChanel_Page detailChanelPage= new DetailChanel_Page(driver);
        Thread.sleep(4000);
        detailChanelPage.clickSwitchBtn();
    }
    @Test
    public void check_tab_in_profile() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(8000);
        driver.get("https://stg.gglive.vn/channel/suzy-de-thu-o-ngggg/51963834507726848");
        Thread.sleep(8000);
        DetailChanel_Page detailChanelPage= new DetailChanel_Page(driver);
        Thread.sleep(4000);
        detailChanelPage.click_tabGioiThieu();
        detailChanelPage.click_tabBXH();
        detailChanelPage.click_tabDaPhatSong();
        detailChanelPage.click_tabClip();
    }

    @Test
    public void check_click_DieuKhoan_QuyenRiengTu() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(8000);
        driver.get("https://stg.gglive.vn/channel/suzy-de-thu-o-ngggg/51963834507726848");
        Thread.sleep(8000);
        Footer_Page footerPage= new Footer_Page(driver);
        Thread.sleep(4000);
        footerPage.clickDieuKhoan();
        footerPage.clickQuyenRiengTu();
    }
    @Test
    public void check_click_DangXuat() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(8000);
        DetailChanel_Page detailChanelPage= new DetailChanel_Page(driver);
        Thread.sleep(4000);
        detailChanelPage.clickbtnDangXuat();
    }
}
