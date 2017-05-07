package appium.tutorial.android.page;

import appium.tutorial.android.util.BaseUnitTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Salome on 27.04.2017.
 */
public class HelloDemoScreen extends BaseUnitTest {


    /** Verify the home page has loaded **/
    public  void loaded() {
        driver.findElementById("name_input").isDisplayed();
        driver.findElementById("android:id/text1").isDisplayed();
        driver.findElementByClassName("android.widget.Button").isDisplayed();
    }


    public void selectCar(String car) {
        List<WebElement> carList =  driver.findElements(By.className("android.widget.CheckedTextView"));

        for (WebElement element : carList) {
            if (element.getText().equals(car)) {
                element.click();
                break;
            }
        }
    }

    public void fillName(String username) {
        WebElement usernameInput = driver.findElementById("name_input");
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void clickSendMeYourNameButton() {
        WebElement button = driver.findElementsByClassName("android.widget.Button").get(1);
        button.isDisplayed();
        button.click();
    }

    public void clickCarSelect() {
        WebElement carSelect = driver.findElementsByClassName("android.widget.Spinner").get(1);
        carSelect.isDisplayed();
        carSelect.click();
    }

}
