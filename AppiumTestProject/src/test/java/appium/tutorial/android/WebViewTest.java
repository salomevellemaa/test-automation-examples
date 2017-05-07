package appium.tutorial.android;

import appium.tutorial.android.page.HelloDemoScreen;
import appium.tutorial.android.page.HomeScreen;
import appium.tutorial.android.page.WebViewScreen;
import appium.tutorial.android.util.BaseUnitTest;
import org.junit.Test;

/**
 * Created by Salome on 27.04.2017.
 */
public class WebViewTest extends BaseUnitTest {

    @Test
    public void testWebView() throws InterruptedException{
        String formPage = "formPage";
        String name = "Mary";
        HomeScreen homeScreen = new HomeScreen();
        WebViewScreen webViewScreen = new WebViewScreen();
        ;HelloDemoScreen helloDemoScreen = new HelloDemoScreen();
        homeScreen.clickWebViewButton();
        webViewScreen.clickTestDataSpinner();
        webViewScreen.selectTestData(formPage);
        webViewScreen.clickTestDataSpinner();
        webViewScreen.selectTestData("'Say Hello'-Demo");
        helloDemoScreen.loaded();
        helloDemoScreen.fillName(name);
        helloDemoScreen.clickCarSelect();
        helloDemoScreen.selectCar("Audi");
        helloDemoScreen.clickSendMeYourNameButton();
        webViewScreen.clickGoHomeButton();
        homeScreen.loaded();

    }

}
