package team.gglive;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class FormChangePasswordTest extends Base_Config{
    String phoneInput = "0977000004";
    String pwInput = "abc1234";
    String new_pwInput = "abc123";
    @Test
    public void changePasswordSuccess() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        ThongTinTaiKhoan_Page thongTinTaiKhoan_page = new ThongTinTaiKhoan_Page(driver);
        thongTinTaiKhoan_page.clicklinktextThongTinTaiKhoan();
        FormChangePassword formChangePassword = thongTinTaiKhoan_page.clickbtnDoiMatKhau();
        Thread.sleep(8000);
        formChangePassword.sendkeyPassword(pwInput);
        formChangePassword.sendkeyNewPassword(new_pwInput);
        formChangePassword.sendkeyReNewPassword(new_pwInput);
        formChangePassword.clickBtnSubmit();
        Thread.sleep(8000);
    }

    @Test
    public void enterWrongNewPW() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(new_pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        ThongTinTaiKhoan_Page thongTinTaiKhoan_page = new ThongTinTaiKhoan_Page(driver);
        thongTinTaiKhoan_page.clicklinktextThongTinTaiKhoan();
        FormChangePassword formChangePassword = thongTinTaiKhoan_page.clickbtnDoiMatKhau();
        Thread.sleep(8000);
        formChangePassword.sendkeyPassword(pwInput);
        formChangePassword.sendkeyNewPassword(new_pwInput);
        formChangePassword.sendkeyReNewPassword(new_pwInput);
        formChangePassword.clickBtnSubmit();
        Thread.sleep(8000);
        formChangePassword.checkMsg();
    }


}
