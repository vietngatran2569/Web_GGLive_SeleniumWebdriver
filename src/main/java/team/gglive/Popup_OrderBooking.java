package team.gglive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup_OrderBooking {
    WebDriver driver;

    public Popup_OrderBooking(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='icon plus']")
    private WebElement iconPlus;

    @FindBy(xpath = "//button[contains(.,'Thanh toán')]")
    private WebElement btnThanhToan;

    public void clickIconPlus(){
        iconPlus.click();
    }

    public void clickBtnThanhToan(){
        btnThanhToan.click();
    }

    
}
