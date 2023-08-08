package team.gglive;

import junit.framework.Assert;
import org.testng.annotations.Test;

import static java.lang.Math.round;

public class AuthenTest extends Base_Config {

    String phoneInput = "0977000002";
    String pwInput = "abc123";

    @Test
    public void fill_Happycase_Login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
    }

    String phoneInputNotRegister = "0966000003";

    @Test
    public void checkPhoneNotRegister() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInputNotRegister);
        RegisterPage registerPage = loginPage.clickbtnTiepTuc_RedirectTo_RegisterPage();
        String actual = registerPage.getTextSDT();
        Assert.assertEquals(phoneInputNotRegister, actual);
    }

    String phoneInputWrongFormat = "033300000222";

    @Test
    public void checkWrongFormatPhone() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInputWrongFormat);
        loginPage.clickBtnTiepTuc();
        Assert.assertEquals("Số điện thoại không hợp lệ", loginPage.getErrorMessage());
    }

    String pwWrong = "nga123";

    @Test
    public void checkWrongPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwWrong);
        loginPage.clickBtnSubmit();
        Assert.assertEquals("Số điện thoại hoặc mật khẩu chưa chính xác", loginPage.getErrorMessage());
    }

    @Test
    public void check_btnCheckboxBtn() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInputNotRegister);
        RegisterPage registerPage = loginPage.clickbtnTiepTuc_RedirectTo_RegisterPage();
        registerPage.checkOnOff_Checkbox();
    }

    String phoneInputNotRegister2 = "0966000089";

    @Test
    public void register_happycase() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInputNotRegister2);
        RegisterPage registerPage = loginPage.clickbtnTiepTuc_RedirectTo_RegisterPage();
        registerPage.clickBtnDangKy();
        registerPage.sendkeyOtp("2222");
        registerPage.clickbtnTiepTuc();
    }

    String phoneInputNotRegister3 = "0966000079";
    String wrongOtp = "1112";

    @Test
    public void wrongOTP() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInputNotRegister3);
        RegisterPage registerPage = loginPage.clickbtnTiepTuc_RedirectTo_RegisterPage();
        registerPage.clickBtnDangKy();
        registerPage.sendkeyOtp(wrongOtp);
        registerPage.clickbtnTiepTuc();
    }



    //    @Test
//    public void testExplicitWait(){
//        WebDriverWait webDriverWait =new WebDriverWait(driver, Duration.ofSeconds(10));
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//    }



}
