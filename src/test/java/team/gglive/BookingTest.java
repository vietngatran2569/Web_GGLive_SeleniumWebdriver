package team.gglive;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class BookingTest extends Base_Config {
    String phoneInput = "0977000002";
    String pwInput = "abc123";

    /**
     * @throws InterruptedException
     */
    @Test
    public void checkSelectPlayerAndBooking() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickGGdou();
        Thread.sleep(4000);
        GGDou_Page ggDou_page = new GGDou_Page(driver);
        ggDou_page.clickbtnClose();
        ggDou_page.setSelectTrangThai();
        Thread.sleep(4000);
        ggDou_page.setSelectSanSang();
        Thread.sleep(4000);
        ggDou_page.clickPlayertoHire(0);
        Thread.sleep(4000);

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentid = it.next();
        String parentid1 = it.next();
        driver.switchTo().window(parentid1);

        DetailChanel_Page detailChanel_Page = new DetailChanel_Page(driver);
        detailChanel_Page.clickbtnDatdon();
        Thread.sleep(4000);

        Popup_OrderBooking popup_OrderBooking = new Popup_OrderBooking(driver);
        popup_OrderBooking.clickIconPlus();
        popup_OrderBooking.clickBtnThanhToan();
        // Thread.sleep(5000);
    }

    @Test
    public void checkBookingUserCancel() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickGGdou();
        Thread.sleep(4000);
        GGDou_Page ggDou_page = new GGDou_Page(driver);
        ggDou_page.clickbtnClose();
        ggDou_page.setSelectTrangThai();
        Thread.sleep(4000);
        ggDou_page.setSelectSanSang();
        Thread.sleep(4000);
        ggDou_page.clickPlayertoHire(0);
        Thread.sleep(4000);

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentid = it.next();
        String parentid1 = it.next();
        driver.switchTo().window(parentid1);

        DetailChanel_Page detailChanel_Page = new DetailChanel_Page(driver);
        detailChanel_Page.clickbtnDatdon();
        Thread.sleep(4000);

        Popup_OrderBooking popup_OrderBooking = new Popup_OrderBooking(driver);
        popup_OrderBooking.clickIconPlus();
        popup_OrderBooking.clickBtnThanhToan();
        Thread.sleep(4000);

        Popup_Chat1_1 popup_Chat1_1 = new Popup_Chat1_1(driver);
        popup_Chat1_1.clickBtnCancel();
        popup_Chat1_1.clickConfirmHuyDon();
        Thread.sleep(10000);
    }

    @Test
    public void checkBookingUserCancel_Close() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        Header_page header_page = new Header_page(driver);
        header_page.clickGGdou();
        Thread.sleep(4000);
        GGDou_Page ggDou_page = new GGDou_Page(driver);
        ggDou_page.clickbtnClose();
        ggDou_page.setSelectTrangThai();
        Thread.sleep(4000);
        ggDou_page.setSelectSanSang();
        Thread.sleep(4000);
        ggDou_page.clickPlayertoHire(0);
        Thread.sleep(4000);

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentid = it.next();
        String parentid1 = it.next();
        driver.switchTo().window(parentid1);

        DetailChanel_Page detailChanel_Page = new DetailChanel_Page(driver);
        detailChanel_Page.clickbtnDatdon();
        Thread.sleep(4000);

        Popup_OrderBooking popup_OrderBooking = new Popup_OrderBooking(driver);
        popup_OrderBooking.clickIconPlus();
        popup_OrderBooking.clickBtnThanhToan();
        Thread.sleep(4000);

        Popup_Chat1_1 popup_Chat1_1 = new Popup_Chat1_1(driver);
        popup_Chat1_1.clickBtnCancel();
        popup_Chat1_1.clickConfirmDong();
        Thread.sleep(10000);
    }

    String sdtPlayer = "0980000002";
    String pwPlayer = "abc1234";

    @Test
    public void checkUserBooking_PlayerReject() throws InterruptedException {

        // login user 1
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        driver.get("https://stg.gglive.vn/channel/nga-test-098xx2/72248957614428160");
        // request booking player
        DetailChanel_Page detailChanel_Page = new DetailChanel_Page(driver);
        detailChanel_Page.clickbtnDatdon();
        Thread.sleep(4000);

        Popup_OrderBooking popup_OrderBooking = new Popup_OrderBooking(driver);
        popup_OrderBooking.clickIconPlus();
        popup_OrderBooking.clickBtnThanhToan();
        Thread.sleep(4000);
        // login player
        loginPage.clickAuth();
        loginPage.clickLogout();

        LoginPage loginPage1 = new LoginPage(driver);
        loginPage1.clickBtnDangNhap();
        loginPage1.sendkeySoDienThoai(sdtPlayer);
        loginPage1.clickBtnTiepTuc();
        loginPage1.sendkeyMatKhau(pwPlayer);
        loginPage1.clickBtnSubmit();
        // click icon Chat - HomePage
        Home_Page home_Page = new Home_Page(driver);
        home_Page.check_click_icon_chat();

        // popup Chat
        Popup_Chat1_1 pChat1_1 = new Popup_Chat1_1(driver);
        pChat1_1.clickConversation(0);
        Thread.sleep(8000);

        // player click Reject
        pChat1_1.playerClickReject();
        Thread.sleep(10000);
    }

    @Test
    public void checkUserBooking_PlayerAccept() throws InterruptedException {

        // login user 1
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnDangNhap();
        loginPage.sendkeySoDienThoai(phoneInput);
        loginPage.clickBtnTiepTuc();
        loginPage.sendkeyMatKhau(pwInput);
        loginPage.clickBtnSubmit();
        loginPage.clickAuth();
        Thread.sleep(4000);
        driver.get("https://stg.gglive.vn/channel/nga-test-098xx2/72248957614428160");
        // request booking player
        DetailChanel_Page detailChanel_Page = new DetailChanel_Page(driver);
        detailChanel_Page.clickbtnDatdon();
        Thread.sleep(4000);

        Popup_OrderBooking popup_OrderBooking = new Popup_OrderBooking(driver);
        popup_OrderBooking.clickIconPlus();
        popup_OrderBooking.clickBtnThanhToan();
        Thread.sleep(4000);
        // login player
        loginPage.clickAuth();
        loginPage.clickLogout();

        LoginPage loginPage1 = new LoginPage(driver);
        loginPage1.clickBtnDangNhap();
        loginPage1.sendkeySoDienThoai(sdtPlayer);
        loginPage1.clickBtnTiepTuc();
        loginPage1.sendkeyMatKhau(pwPlayer);
        loginPage1.clickBtnSubmit();
        // click icon Chat - HomePage
        Home_Page home_Page = new Home_Page(driver);
        home_Page.check_click_icon_chat();

        // popup Chat
        Popup_Chat1_1 pChat1_1 = new Popup_Chat1_1(driver);
        pChat1_1.clickConversation(0);
        Thread.sleep(8000);

        // player click Reject
        pChat1_1.playerClickAccept();
        Thread.sleep(10000);
    }

}
