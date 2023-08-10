package team.gglive;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header_page {
    WebDriver driver;

    public Header_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Trang chủ')]")
    private WebElement trangchu;
    @FindBy(xpath = "//a[contains(text(),'Khám phá')]")
    private WebElement khampha;
    @FindBy(xpath = "//a[contains(text(),'Theo dõi')]")
    private WebElement theodoi;
    @FindBy(xpath = "//a[contains(text(),'Bảng xếp hạng')]")
    private WebElement bxh;
    @FindBy(xpath = "//a[contains(text(),'GG Duo')]")
    private WebElement ggduo;
    @FindBy(xpath = "//input[@placeholder='Tìm kiếm']")
    private WebElement search;
    @FindBy(css = ".menu-item > .btn-v2")
    private WebElement napGcoin;
    @FindBy(xpath = "//img[@alt='icon-stream']")
    private WebElement iconStream;
    @FindBy(xpath = "//img[@alt='icon-noti']")
    private WebElement iconNoti;

    public void clickTrangchu() {
        trangchu.click();
    }

    public void clickKhampha() {
        khampha.click();
    }

    public void clickTheodoi() {
        theodoi.click();
    }

    public void clickBxh() {
        bxh.click();
    }

    public void clickGGdou() {
        ggduo.click();
    }

    public void clickSearch(String text) throws InterruptedException {
        search.sendKeys(text);
        Thread.sleep(5000);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

    public void clickNapgcoin() {
        napGcoin.click();
    }

    public void clickCreateStream() {
        napGcoin.click();
    }

    public void clickIconNoti() {
        iconNoti.click();
    }

}
