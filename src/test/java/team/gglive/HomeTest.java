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
        Home_Page homePage= new Home_Page(driver);
        homePage.clickTrangchu();
        Thread.sleep(4000);
        homePage.check_display_parent_category();
    }

    @Test
    public void check_trangchu_chua_login() throws InterruptedException {
        Home_Page homePage= new Home_Page(driver);
        homePage.clickTrangchu();
        Thread.sleep(4000);
        homePage.check_display_btn_chat_not_login();
        Thread.sleep(4000);
    }

}
