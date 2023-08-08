package team.gglive;

import org.testng.annotations.Test;

public class FormWalletTest extends Base_Config{

    String phoneInput = "0977000002";
    String pwInput = "abc123";
    @Test
    public void checkverify_gcoin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Form_Wallet formWallet = new Form_Wallet(driver);
        formWallet.verifyGcoin();
    }

    @Test
    public void checkverify_sapphire() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Form_Wallet formWallet = new Form_Wallet(driver);
        formWallet.verifySapphire();
    }

}
