package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailChanel_Page {
    WebDriver driver;

    public DetailChanel_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(.,'Theo dõi')]")
    private WebElement btnTheoDoi;
    @FindBy(xpath = "//button[contains(.,'Đã theo dõi')]")
    private WebElement btnDaTheoDoi;
    @FindBy(xpath = "//button[contains(.,'Có, bỏ theo dõi')]")
    private WebElement btnCoBoTheoDoi;
    @FindBy(xpath = "//button[contains(.,'Chat')]")
    private WebElement btnChat;
    @FindBy(xpath = "//span[contains(.,'Giới thiệu')]")
    private WebElement tabGioiThieu;
    @FindBy(xpath = "//span[contains(.,'Bảng xếp hạng')]")
    private WebElement tabBXH;
    @FindBy(xpath = "//span[contains(.,'Đã phát sóng')]")
    private WebElement tabDaPhatSong;
    @FindBy(xpath = "//span[contains(.,'Clip')]")
    private WebElement tabClip;
    @FindBy(xpath = "//span[contains(text(),'Đăng xuất')]")
    private WebElement btnDangXuat;

    public void clickbtnTheodoi() {
        btnTheoDoi.click();
    }

    public void clickbtnDaTheoDoi() throws InterruptedException {
        btnDaTheoDoi.click();
        Thread.sleep(4000);
        btnCoBoTheoDoi.click();
    }

    public void clickbtnChat() {
        btnChat.click();
    }

    public void clickSwitchBtn() throws InterruptedException {
        if (btnDaTheoDoi.isDisplayed()) {
            clickbtnDaTheoDoi();
        } else if (btnTheoDoi.isDisplayed()) {
            clickbtnTheodoi();
        } else {
            System.out.println("not found");
        }
    }

    public void click_tabGioiThieu() {
        tabGioiThieu.click();
    }

    public void click_tabBXH() {
        tabBXH.click();
    }

    public void click_tabDaPhatSong() {
        tabDaPhatSong.click();
    }

    public void click_tabClip() {
        tabClip.click();
    }

    public void clickbtnDangXuat(){
        btnDangXuat.click();
    }


}
