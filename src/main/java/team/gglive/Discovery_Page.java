package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Discovery_Page {
    WebDriver driver;

    public Discovery_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[contains(.,'Khám phá')]")
    private WebElement textKhampha;
    @FindBy(xpath = "//li[contains(.,'Tất cả')]")
    private WebElement btnTatCa;
    @FindBy(xpath = "//li[contains(.,'Giải Trí')]")
    private WebElement btnGiaiTri;
    @FindBy(xpath = "//li[contains(.,'PC Game')]")
    private WebElement btnPCGame;
    @FindBy(xpath = "//li[contains(.,'Mobile Game')]")
    private WebElement btnMobileGame;
    @FindBy(xpath = "//span[contains(.,'Kênh thu hút')]")
    private WebElement textKenhThuHut;
    @FindBy(xpath = "//span[contains(.,'Livestream')]")
    private WebElement textLivestream;

    public void checkVerifyText(){
        Assert.assertEquals(textKhampha.getText(), "Khám phá");
        Assert.assertEquals(textKenhThuHut.getText(), "Kênh thu hút");
        Assert.assertEquals(textLivestream.getText(), "Livestream");
    }

    public void checkClickbtnTatCa(){
        btnTatCa.click();
    }

    public void checkClickbtnGiaiTri(){
        btnGiaiTri.click();
    }

    public void checkClickbtnPCGame(){
        btnPCGame.click();
    }

    public void checkClickbtnMobileGame(){
        btnMobileGame.click();
    }

}
