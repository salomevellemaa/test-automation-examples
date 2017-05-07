package com.example.android.testing.uiautomator.BasicSample;

import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Salome on 23.04.2017.
 */

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class CheckElementsOnHomeScreenTest extends BaseUnitTest {

    @Test
    public void testElementsOnHomeScreen() {
        UiObject enButton = mDevice.findObject(new UiSelector()
                .text("EN Button")
                .className("android.widget.Button"));

        UiObject startWebViewButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/buttonStartWebview")
                .className("android.widget.ImageButton"));

        UiObject textField = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/my_text_fieldmy_text_field")
                .className("android.widget.EditText"));

        UiObject waitingButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/waitingButtonTest")
                .className("android.widget.Button"));

        UiObject checkBox = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/input_adds_check_box")
                .className("android.widget.CheckBox"));

        UiObject visibleButtonTest = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/visibleButtonTest")
                .className("android.widget.Button"));

        UiObject toastButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/showToastButton")
                .className("android.widget.Button"));

        UiObject popupButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/showPopupWindowButton")
                .className("android.widget.Button"));

        UiObject exceptionButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/exceptionTestButton")
                .className("io.selendroid.testapp:id/exceptionTestButton"));

        UiObject exceptionTestField = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/exceptionTestField")
                .className("android.widget.EditText"));

        UiObject layoutButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/topLevelElementTest")
                .className("android.widget.Button"));

        UiObject touchButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/touchTest")
                .className("android.widget.Button"));


        Assert.assertNotNull(enButton);
        Assert.assertNotNull(startWebViewButton);
        Assert.assertNotNull(textField);
        Assert.assertNotNull(waitingButton);
        Assert.assertNotNull(checkBox);
        Assert.assertNotNull(toastButton);
        Assert.assertNotNull(popupButton);
        Assert.assertNotNull(exceptionButton);
        Assert.assertNotNull(exceptionTestField);
        Assert.assertNotNull(layoutButton);
        Assert.assertNotNull(touchButton);
        Assert.assertNotNull(visibleButtonTest);
    }
}
