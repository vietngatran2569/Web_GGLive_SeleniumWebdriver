package team.gglive;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup_Chat1_1 {

    WebDriver driver;

    public Popup_Chat1_1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@id='img-chat-module']")
    private WebElement imgChatModule;

    @FindBy(css = ".chat-item-info-content")
    private List<WebElement> listConversation;

    @FindBy(xpath = "//img[@alt='ic-order']")
    private WebElement btnOrder;

    @FindBy(xpath = "//button[contains(text(),'Hủy')]")
    private WebElement btnCancel;

    @FindBy(xpath = "//button[contains(text(),'Hủy đơn')]")
    private WebElement btnConfirmHuyDon;

    @FindBy(xpath = "//button[contains(text(),'Đóng')]")
    private WebElement btnConfirmClose;

    @FindBy(css = ".MuiIconButton-label > svg")
    private WebElement iconMore;

    @FindBy(xpath = "//button[contains(text(),'Đồng ý')]")
    private WebElement btnAccept;

    @FindBy(xpath = "//button[contains(text(),'Từ chối')]")
    private WebElement btnReject;

    public void clickChatModule() {
        imgChatModule.click();
    }

    public void clickConversation(int index) {
        listConversation.get(index).click();
    }

    public void clickBtnOder() {
        btnOrder.click();
    }

    public void clickBtnCancel() {
        btnCancel.click();
    }

    public void clickConfirmHuyDon() {
        btnConfirmHuyDon.click();
    }

    public void clickConfirmDong() {
        btnConfirmClose.click();
    }

    public void playerClickAccept(){
        btnAccept.click();
    }

    public void playerClickReject(){
        btnReject.click();
    }

}
