package team.gglive;

import org.testng.annotations.Test;

import java.io.IOException;

public class FormCapNhatThongTinTaiKhoanTest extends Base_Config {
    String phoneInput = "0977000003";
    String pwInput = "abc123";

    @Test
    public void changeBanner() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        loginPage.clickAuth();
        ThongTinTaiKhoan_Page thongTinTaiKhoan_page = new ThongTinTaiKhoan_Page(driver);
        thongTinTaiKhoan_page.clicklinktextThongTinTaiKhoan();
        thongTinTaiKhoan_page.clickbtn_camera_cover();
        Thread.sleep(8000);
        thongTinTaiKhoan_page.clickchooseImage();
        Thread.sleep(8000);
        thongTinTaiKhoan_page.clickBtnLuu();
        Thread.sleep(8000);
    }

    @Test
    public void changeAvatar() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        ThongTinTaiKhoan_Page thongTinTaiKhoan_page = new ThongTinTaiKhoan_Page(driver);
        thongTinTaiKhoan_page.clicklinktextThongTinTaiKhoan();
        thongTinTaiKhoan_page.clickChooseAvatar();
        Thread.sleep(8000);
        thongTinTaiKhoan_page.btnChooseImage_avt();
        Thread.sleep(8000);
        thongTinTaiKhoan_page.clickBtnLuu();
        Thread.sleep(8000);
    }

    @Test
    public void updateThongTinTaiKhoan() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        ThongTinTaiKhoan_Page thongTinTaiKhoan_page = new ThongTinTaiKhoan_Page(driver);
        thongTinTaiKhoan_page.clicklinktextThongTinTaiKhoan();
        FormCapNhatThongTinTaiKhoan formCapNhatThongTinTaiKhoan = thongTinTaiKhoan_page.clickbtnChinhSua();
        formCapNhatThongTinTaiKhoan.sendkeyFullname("Nga nè 1999");
        Thread.sleep(8000);
        formCapNhatThongTinTaiKhoan.setGender("male");
        formCapNhatThongTinTaiKhoan.sendkeyDescription("Đây là nga nhé");
//        Thread.sleep(8000);
//        formCapNhatThongTinTaiKhoan.setChooseImage();
//        Thread.sleep(10000);
        formCapNhatThongTinTaiKhoan.clickbtnCapNhat();
        Thread.sleep(8000);
    }

    @Test
    public void update_Album_Anh_ThongTinTaiKhoan() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        ThongTinTaiKhoan_Page thongTinTaiKhoan_page = new ThongTinTaiKhoan_Page(driver);
        thongTinTaiKhoan_page.clicklinktextThongTinTaiKhoan();
        FormCapNhatThongTinTaiKhoan formCapNhatThongTinTaiKhoan = thongTinTaiKhoan_page.clickbtnChinhSua();
        Thread.sleep(8000);
        formCapNhatThongTinTaiKhoan.setChooseImage();
        Thread.sleep(10000);
    }

}
