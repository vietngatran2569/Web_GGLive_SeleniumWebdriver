package team.gglive;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormChangePassword {

    WebDriver webDriver;

    public FormChangePassword(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this );
    }

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "new_password")
    private WebElement new_password;

    @FindBy(id = "re_new_password")
    private WebElement re_new_pw;

    @FindBy(css = ".error-message")
    private List<WebElement> errorMsg;

    @FindBy(xpath = "//button[@type =\"submit\"]")
    private WebElement btnSubmit;

    public void sendkeyPassword(String text){
        password.sendKeys(text);
    }

    public void sendkeyNewPassword(String text){
        new_password.sendKeys(text);
    }

    public void sendkeyReNewPassword(String text){
        re_new_pw.sendKeys(text);
    }

    public void clickBtnSubmit(){
        btnSubmit.click();
    }

    public void checkMsg(){
        if (new_password.getText() != re_new_pw.getText()){
            Assert.assertEquals(errorMsg,"Hai mật khẩu phải trùng khớp nhau");
        }else if (new_password.getText().length() < 6){
            Assert.assertEquals(errorMsg,"Mật khẩu tối thiểu 6 ký tự, bao gồm cả chữ & số");
        }
    }



}
