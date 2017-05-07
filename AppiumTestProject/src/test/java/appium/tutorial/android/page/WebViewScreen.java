package appium.tutorial.android.page;

import appium.tutorial.android.util.BaseUnitTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Salome on 27.04.2017.
 */
public class WebViewScreen extends BaseUnitTest {


    public void clickGoHomeButton() {
        WebElement goHomeButton = driver.findElementById("io.selendroid.testapp:id/goBack");
        goHomeButton.isDisplayed();
        goHomeButton.click();
    }

    /** Verify the home page has loaded **/
    public  void loaded() {
        driver.findElementById("io.selendroid.testapp:id/spinner_webdriver_test_data").isDisplayed();
    }

    public void clickTestDataSpinner() {
        WebElement testDataSpinner = driver.findElementById("io.selendroid.testapp:id/spinner_webdriver_test_data");
        testDataSpinner.isDisplayed();
        testDataSpinner.click();
    }

    public void selectTestData(String data) {
        List<WebElement> testDataList =  driver.findElements(By.className("android.widget.TextView"));

        for (WebElement element : testDataList) {
            if (element.getText().equals(data)) {
                element.click();
                break;
            }
        }
    }
}
