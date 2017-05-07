package appium.tutorial.android.page;

import appium.tutorial.android.util.BaseUnitTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/** Page object for the home page **/

public class HomeScreen extends BaseUnitTest {

    public void enButtonClick() {
        EnButtonScreen enButtonScreen = new EnButtonScreen();
        WebElement enButton = driver.findElement(By.id("io.selendroid.testapp:id/buttonTest"));
        loaded();
        enButton.isDisplayed();
        enButton.click();
        enButtonScreen.loaded();
    }

    public void clickWebViewButton() {
        WebViewScreen sartWebViewuttonScreen = new WebViewScreen();
        WebElement startWebViewutton = driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview"));
        loaded();
        startWebViewutton.isDisplayed();
        startWebViewutton.click();
        sartWebViewuttonScreen.loaded();
    }


    public void waitingButtonClick() {
        WebElement waitingButton = driver.findElement(By.id("io.selendroid.testapp:id/waitingButtonTest"));
        loaded();
        waitingButton.isDisplayed();
        waitingButton.click();
    }


    public void clickPopupButton() {
        WebElement popupButton = driver.findElement(By.id("io.selendroid.testapp:id/showPopupWindowButton"));
        loaded();
        popupButton.isDisplayed();
        popupButton.click();
        PopupScreen popup = new PopupScreen();
        popup.loaded();
    }

    public void clickTOuchActionsButton() {
        WebElement touchActionsButton = driver.findElement(By.id("io.selendroid.testapp:id/touchTest"));
        loaded();
        touchActionsButton.isDisplayed();
        touchActionsButton.click();
        GesturesScreen gesturesScreen = new GesturesScreen();
        gesturesScreen.loaded();
    }

    public WebElement getTextField() {
        return driver.findElement(By.id("io.selendroid.testapp:id/my_text_field"));
    }

    public WebElement getVisibleButtonTest() {
        return driver.findElement(By.id("io.selendroid.testapp:id/visibleButtonTest"));
    }

    public WebElement getEnButton() {
        return driver.findElement(By.id("io.selendroid.testapp:id/buttonTest"));
    }

    public WebElement getStartWebViewutton() {
        return driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview"));
    }

    public WebElement getWaitingButton() {
        return driver.findElement(By.id("io.selendroid.testapp:id/waitingButtonTest"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("io.selendroid.testapp:id/input_adds_check_box"));
    }

    public WebElement getToastButton() {
        return driver.findElement(By.id("io.selendroid.testapp:id/showToastButton"));
    }

    public WebElement getPopupButton() {
        return driver.findElement(By.id("io.selendroid.testapp:id/showPopupWindowButton"));
    }

    public WebElement getExceptionButton() {
        return driver.findElement(By.id("io.selendroid.testapp:id/exceptionTestButton"));
    }

    public WebElement getExceptionTestField() {
        return driver.findElement(By.id("io.selendroid.testapp:id/exceptionTestField"));
    }

    public WebElement getLayoutButton() {
        return driver.findElement(By.id("io.selendroid.testapp:id/topLevelElementTest"));
    }

    public WebElement getTouchButton() {
        return driver.findElement(By.id("io.selendroid.testapp:id/touchTest"));
    }

    /** Verify the home page has loaded **/
    public  void loaded() {
        driver.findElement(By.className("android.widget.TextView")).getText().equals("selendroid-test-app");
    }
}