package appium.tutorial.android;

import appium.tutorial.android.page.GesturesScreen;
import appium.tutorial.android.page.HelloDemoScreen;
import appium.tutorial.android.page.HomeScreen;
import appium.tutorial.android.page.WebViewScreen;
import appium.tutorial.android.util.BaseUnitTest;
import org.junit.Test;

/**
 * Created by Salome on 27.04.2017.
 */
public class GesturesTest extends BaseUnitTest {

    @Test
    public void testGestures() throws InterruptedException{
        String tap = "SINGLE TAP CONFIRMED";
        String longPress = "LONG PRESS";
        String doubleTap = "ON DOUBLE TAP";
        HomeScreen homeScreen = new HomeScreen();
        GesturesScreen gesturesScreen = new GesturesScreen();
        homeScreen.loaded();
        homeScreen.clickTOuchActionsButton();
        gesturesScreen.loaded();
        gesturesScreen.tap();
        gesturesScreen.checkGesture(tap);
        gesturesScreen.longPress();
        gesturesScreen.checkGesture(longPress);
        //gesturesScreen.doubleTapElement();
        // gesturesScreen.checkGesture(doubleTap);


    }

}
