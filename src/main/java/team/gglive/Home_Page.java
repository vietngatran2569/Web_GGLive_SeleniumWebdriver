package team.gglive;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_Page {
    WebDriver driver;

    public Home_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Trang chủ')]")
    private WebElement trangchu;
    @FindBy(xpath = "//h4[contains(text(),'Game')]")
    private WebElement game;

    @FindBy(xpath = "//h4[contains(text(),'Giải trí')]")
    private WebElement giaitri;

    @FindBy(xpath = "//h4[contains(text(),'Top Idol')]")
    private WebElement topIdol;

    @FindBy(xpath = "//img[@id='img-chat-module']")
    private WebElement img_chat_module;

    public void clickTrangchu() {
        trangchu.click();
    }

    public void check_display_parent_category() {
        Assert.assertEquals(game.isDisplayed(), true);
        Assert.assertEquals(giaitri.isDisplayed(), true);
        Assert.assertEquals(topIdol.isDisplayed(), true);
        Assert.assertEquals(img_chat_module.isDisplayed(), true);
    }

    public void check_display_btn_chat_not_login() throws InterruptedException {
        Assert.assertEquals(!img_chat_module.isDisplayed(), true);
        Thread.sleep(4000);
    }


}
