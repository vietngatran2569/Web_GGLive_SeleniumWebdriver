package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class Follow_Page {
    WebDriver driver;

    public Follow_Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//span[contains(.,'Theo dõi')]")
    private WebElement textTheoDoi;

    @FindBy(xpath = "//span[contains(.,'Livestream')]")
    private WebElement textLivestream;

    @FindBy(xpath = "//span[contains(.,'Video')]")
    private WebElement textVideo;

    @FindBy(xpath = "//span[contains(.,'Danh mục')]")
    private WebElement textDanhMuc;

    @FindBy(xpath = "//li[contains(.,'Tất cả')]")
    private WebElement tabTatca;

    @FindBy(xpath = "//li[contains(.,'Kênh đang trực tiếp')]")
    private WebElement tabKenhdangtructiep;

    @FindBy(xpath = "//li[contains(.,'Livestream')]")
    private WebElement tabLivestream;

    @FindBy(xpath = "//li[contains(.,'Video')]")
    private WebElement tabVideo;

    @FindBy(xpath = "//li[contains(.,'Kênh ngoại tuyến')]")
    private WebElement tabKenhngoaituyen;

    @FindBy(xpath = "//li[contains(.,'Danh mục')]")
    private WebElement tabDanhmuc;

    public void checkverifyText() {
        Assert.assertEquals(textTheoDoi.getText(), "Theo dõi");
        Assert.assertEquals(textLivestream.getText(), "Livestream");
        Assert.assertEquals(textVideo.getText(), "Video");
        Assert.assertEquals(textDanhMuc.getText(), "Danh Mục");
    }

    public void clickTabTatca() {
        tabTatca.click();
    }

    public void clickTabKenhdangtructiep() {
        tabKenhdangtructiep.click();
    }

    public void clickTabLivestream() {
        tabLivestream.click();
    }

    public void clickTabVideo() {
        tabVideo.click();
    }

    public void clickTabKenhngoaituyen() {
        tabKenhngoaituyen.click();
    }

    public void clickTabDanhmuc() {
        tabDanhmuc.click();
    }

}
