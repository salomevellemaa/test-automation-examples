package appium.tutorial.android;

import appium.tutorial.android.page.HomeScreen;
import appium.tutorial.android.util.BaseUnitTest;
import org.junit.Test;



public class CheckElementsOnHomeScreenTest extends BaseUnitTest {

    @Test
    public void objectsVisible() throws InterruptedException{
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.getEnButton().isDisplayed();
        homeScreen.getStartWebViewutton().isDisplayed();
        homeScreen.getTextField().isDisplayed();
        homeScreen.getWaitingButton().isDisplayed();
        homeScreen.getCheckBox().isDisplayed();
        homeScreen.getToastButton().isDisplayed();
        homeScreen.getPopupButton().isDisplayed();
        homeScreen.getExceptionButton().isDisplayed();
        homeScreen.getExceptionTestField().isDisplayed();
        homeScreen.getLayoutButton().isDisplayed();
        homeScreen.getTouchButton().isDisplayed();
        homeScreen.getVisibleButtonTest().isDisplayed();
    }
}