package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Đăng nhập')]")
    private WebElement btnDangnhap;

    @FindBy(id = "phone")
    private WebElement inputSoDienThoai;

    @FindBy(css = ".w-100 > .font-bold")
    private WebElement btnTieptuc;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(css = ".error-message")
    private WebElement error_message;

    @FindBy(css = ".btn-default:nth-child(1) > .circle")
    private WebElement auth;

    @FindBy(xpath = "//span[contains(text(),'Đăng xuất')]")
    private WebElement btnLogout;

    // @FindBy(xpath = "//a[@href=\"/bang-xep-hang\"]")
    // private WebElement click_bxh;

    public void clickBtnDangNhap() {
        driver.manage().window().maximize();
        btnDangnhap.click();
    }

    public void sendkeySoDienThoai(String sdt) {
        inputSoDienThoai.sendKeys(sdt);
    }

    public void clickBtnTiepTuc() {
        btnTieptuc.click();
    }

    public void sendkeyMatKhau(String input) {
        inputPassword.sendKeys(input);
    }

    public void clickBtnSubmit() {
        btnSubmit.click();
    }

    public String getErrorMessage() {
        return error_message.getText();
    }

    public RegisterPage clickbtnTiepTuc_RedirectTo_RegisterPage() {
        btnTieptuc.click();
        return new RegisterPage(driver);
    }

    public void clickAuth() {
        auth.click();
    }

    public void clickLogout() {
        btnLogout.click();
    }

    // public void setClick_bxh(){
    // click_bxh.click();
    // }

}
