package team.gglive;

import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GGDou_Page {

    WebDriver driver;

    public GGDou_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt=\"icon-close\"]")
    private WebElement iconClose;

    @FindBy(xpath = "//h4[contains(text(),'Chơi cùng tôi')]")
    private WebElement textHireme;

    @FindBy(xpath = "//div[contains(text(),'Danh mục')]")
    private WebElement selectCategory;

    @FindBy(xpath = "//div[contains(text(),'Trò Chuyện')]")
    private WebElement selectTrochuyen;

    @FindBy(xpath = "//div[contains(text(),'Giá từ thấp - cao')]")
    private WebElement selectPrice;

    @FindBy(xpath = "//div[contains(text(),'Giới tính')]")
    private WebElement selectGender;

    @FindBy(xpath = "//div[contains(text(),'Trạng thái')]")
    private WebElement selectStatus;

    @FindBy(xpath = "//div[contains(text(),'Vị trí')]")
    private WebElement selectLocation;

    public void getTextHireme(String text) {
        String text1 = textHireme.getText();
        Assert.assertEquals(text, text1);
    }

    public void clickbtnClose(){
        iconClose.click();
    }
    public void selectDanhmuc() throws InterruptedException {
        selectCategory.click();
        Thread.sleep(5000);
//        Select select1 = new Select(selectCategory);
//        select1.selectByValue(text);
//        WebElement element = driver.findElement(By.id("id_of_element"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectCategory);
        Thread.sleep(500);
    }

    public void setSelectTrochuyen(){
        selectTrochuyen.click();
    }



}