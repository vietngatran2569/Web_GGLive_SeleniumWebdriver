package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ThongTinTaiKhoan_Page {
    WebDriver webDriver;

    public ThongTinTaiKhoan_Page(WebDriver webDriver){
        this.webDriver=webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(linkText = "Thông tin tài khoản")
    private WebElement linktextThongTinTaiKhoan;

    @FindBy(css =".btn-camera-cover")
    private WebElement btn_camera_cover;

    @FindBy(css = ".button-edit-cover")
    private WebElement chooseImage_cover;

    @FindBy(xpath = "//button[contains(text(),'Lưu')]")
    private WebElement btnLuu;

    @FindBy(css =".color-dark-custom > path")
    private WebElement btn_camera_avatar;

    @FindBy(css = ".icon-upload-avatar")
    private WebElement btnChooseImage_avt;

    @FindBy(css = ".user-info-btn-edit")
    private WebElement btnChinhSua;

    @FindBy(css = ".user-info-btn-change-password")
    private WebElement btnDoiMatKhau;

    public void clicklinktextThongTinTaiKhoan(){
        linktextThongTinTaiKhoan.click();
    }

    public void clickbtn_camera_cover(){
        btn_camera_cover.click();
    }

    public void clickchooseImage() throws IOException, InterruptedException {
        chooseImage_cover.click();
        Thread.sleep(4000);
        Runtime.getRuntime().exec("C:\\Users\\trang\\Videos\\Captures\\nganef.exe");
    }

    public void clickBtnLuu(){
        btnLuu.click();
    }

    public void clickChooseAvatar(){
        btn_camera_avatar.click();
    }

    public void btnChooseImage_avt() throws InterruptedException, IOException {
        btnChooseImage_avt.click();
        Thread.sleep(4000);
        Runtime.getRuntime().exec("C:\\Users\\trang\\Videos\\Captures\\nganef.exe");
    }

    public FormCapNhatThongTinTaiKhoan clickbtnChinhSua(){
        btnChinhSua.click();
        return new FormCapNhatThongTinTaiKhoan(webDriver);
    }

    public FormChangePassword clickbtnDoiMatKhau(){
        btnDoiMatKhau.click();
        return new FormChangePassword(webDriver);
    }




}
