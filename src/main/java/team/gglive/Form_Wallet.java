package team.gglive;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_Wallet {
    WebDriver driver;

    public Form_Wallet (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css= ".mr-10 > .fs-14")
    private WebElement gcoin_underUserId;

    @FindBy(css = ".d-flex:nth-child(2) > .color-white:nth-child(2)")
    private WebElement sapphier_underUserId;

    @FindBy(css =".my-wallet__balance__gcoin .fs-48")
    private WebElement mywallet_gcoin;

    @FindBy(css =".my-wallet__balance__sapphire .fs-48")
    private WebElement mywallet_sapphire;

    @FindBy(css =".my-wallet__balance__bean .fs-48")
    private WebElement getMywallet_bean;


    public void verifyGcoin(){
        Assert.assertEquals(gcoin_underUserId.getText(),mywallet_gcoin.getText());
    }

    public void verifySapphire(){
        Assert.assertEquals(sapphier_underUserId.getText(),mywallet_sapphire.getText());
    }



}
