package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BXH_Page {
    WebDriver driver;

    public BXH_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(.,'Bảng xếp hạng')]")
    private WebElement textBXH;

    @FindBy(css = ".tabs-item:nth-child(1)")
    private WebElement tabGame;

    @FindBy(css = ".tabs-item:nth-child(2)")
    private WebElement tabGiaiTri;

    @FindBy(css = ".tabs-item:nth-child(3)")
    private WebElement tabGGDuo;

    @FindBy(css = ".cursor-normal")
    private WebElement clickdropdown;

    @FindBy(css = ".item:nth-child(1)")
    private WebElement dropdownTheoNgay;

    @FindBy(css = ".item:nth-child(3)")
    private WebElement dropdownTheoThang;

    public void checkVerifyText(){
        Assert.assertEquals(textBXH.getText(),"Bảng xếp hạng");
    }

    public void clickTabGame(){
        tabGame.click();
    }

    public void clickTabGiaiTri(){
        tabGiaiTri.click();
    }

    public void clickTabGGDuo(){
        tabGGDuo.click();
    }

    public void clickTheoNgay(){
        clickdropdown.click();
        dropdownTheoNgay.click();
    }

    public void clickTheoThang(){
        clickdropdown.click();
        dropdownTheoThang.click();
    }


}
