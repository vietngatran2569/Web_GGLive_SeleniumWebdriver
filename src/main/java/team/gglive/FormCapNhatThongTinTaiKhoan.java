package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class FormCapNhatThongTinTaiKhoan {

    WebDriver driver;

    public FormCapNhatThongTinTaiKhoan(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "fullname")
    private WebElement fullname;

    @FindBy(id = "genderMale")
    private WebElement maleOption;

    @FindBy(id = "genderFemale")
    private WebElement femaleOption;

    @FindBy(id = "genderOther")
    private WebElement othergenderOption;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement description;

    @FindBy(xpath = "//*[contains(text(),'Thêm ảnh')]")
    private WebElement chooseImage;

    @FindBy(xpath = "//button[contains(text(),'Cập nhật')]")
    private WebElement btnCapNhat;

    public void setGender(String gender) {
        if (gender.contains("female")) {
            femaleOption.click();
        } else if (gender.contains("male")) {
            maleOption.click();
        } else
            othergenderOption.click();
    }

    public void sendkeyFullname(String name) {
        fullname.sendKeys(name);
    }

    public void sendkeyDescription(String text) {
        description.sendKeys(text);
    }

    public void setChooseImage() throws InterruptedException, IOException {
        chooseImage.click();
        Thread.sleep(8000);
        Runtime.getRuntime().exec("C:\\Users\\trang\\Videos\\Captures\\nganef.exe");
        Thread.sleep(8000);
    }

    public void clickbtnCapNhat(){
        btnCapNhat.click();
    }





}
