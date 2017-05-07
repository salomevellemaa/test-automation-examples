package appium.tutorial.android.page;

import appium.tutorial.android.util.BaseUnitTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Salome on 29.04.2017.
 */
public class GesturesScreen extends BaseUnitTest {

    public void loaded() {
        driver.findElementById("io.selendroid.testapp:id/LinearLayout1").isDisplayed();
    }

    public void tap() {
        WebElement layout = driver.findElementById("io.selendroid.testapp:id/LinearLayout1");
        layout.click();
    }

    public void  doubleTapElement() {
        WebElement layout = driver.findElementById("io.selendroid.testapp:id/LinearLayout1");
        Actions act = new Actions(driver);
        act.doubleClick(layout).build().perform();
    }

    public void  longPress() {
        WebElement layout = driver.findElementById("io.selendroid.testapp:id/LinearLayout1");
        TouchAction action = new TouchAction(driver);
        action.longPress(layout).release().perform();

    }

    public void checkGesture(String gesture) {
        String gestureOnScreen = driver.findElementById("io.selendroid.testapp:id/gesture_type_text_view").getText();
        gestureOnScreen.equals(gesture);
    }
}