package com.example.android.testing.uiautomator.BasicSample;

import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Salome on 23.04.2017.
 */

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class EnButtonTest extends BaseUnitTest {

    @Test
    public void testEnButton() throws UiObjectNotFoundException {
        UiObject enButton = mDevice.findObject(new UiSelector()
                .text("EN Button")
                .className("android.widget.Button"));
        enButton.click();
        mDevice.findObject(new UiSelector()
                .text("This will end the activity"));
        mDevice.findObject(new UiSelector()
                .resourceId("android:id/button1"));
        UiObject noButton = mDevice.findObject(new UiSelector()
                .resourceId("android:id/button2"));
        if (noButton.exists()) {
            noButton.click();
        }
    }
}
