package team.gglive;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h4[contains(text(),'Đăng ký')]")
    private WebElement textHeaderDangKy;

    @FindBy(xpath = "//p[contains(.,'Đăng ký tài khoản GGLive với số điện thoại')]")
    private WebElement textSecond;

    @FindBy(css = ".mt-4")
    private WebElement textSDT;

    @FindBy(xpath = "//span/input[@type=\"checkbox\"]")
    private WebElement checkbox;

    @FindBy(css = ".step-register-check > .color-white")
    private WebElement textDieuKhoanvaChinhSach;

    @FindBy(xpath = "//button[contains(.,'Đăng ký')]")
    private WebElement btnDangKy;

    @FindBy(id = "otp")
    private WebElement otpInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnTieptuc;

    public void getTextHeaderDangKy() {
        textHeaderDangKy.getText();
    }

    public void getTextSecond() {
        textSecond.getText();
    }

    public String getTextSDT() {
        return textSDT.getText();
    }

    public void getTextDieuKhoanvaChinhSach() {
        textDieuKhoanvaChinhSach.getText();
    }

    public void clickBtnDangKy() {
        btnDangKy.click();
    }

    public void checkOnOff_Checkbox() {
        checkbox.click();
        boolean trueDisplay = checkbox.isDisplayed();
        if (!trueDisplay) {
            Assert.assertEquals(true, btnDangKy.isDisplayed());
        } else {
            Assert.assertEquals(false, btnDangKy.isDisplayed());
        }
    }

    public void sendkeyOtp(String otp){
        otpInput.sendKeys(otp);
    }

    public void clickbtnTiepTuc(){
        btnTieptuc.click();
    }

}
