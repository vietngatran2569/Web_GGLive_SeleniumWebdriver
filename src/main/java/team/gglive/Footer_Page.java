package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer_Page {

    WebDriver driver;

    public Footer_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(.,'Điều khoản')]")
    private WebElement dieuKhoan;
    @FindBy(xpath = "//a[contains(.,'Quyền riêng tư')]")
    private WebElement quyenRiengTu;
    @FindBy(xpath = "//a[contains(.,'Liên hệ')]")
    private WebElement lienHe;
    @FindBy(xpath = "//a[contains(.,'Cẩm nang')]")
    private WebElement camNang;
    @FindBy(xpath = "//a[contains(.,'Ứng dụng')]")
    private WebElement ungDung;

    public void clickDieuKhoan() {
        dieuKhoan.click();
    }
    public void clickQuyenRiengTu() {
        quyenRiengTu.click();
    }
    public void clickLienHe() {
        lienHe.click();
    }
    public void clickCamnang() {
        camNang.click();
    }
    public void clickUngdung() {
        ungDung.click();
    }
}
