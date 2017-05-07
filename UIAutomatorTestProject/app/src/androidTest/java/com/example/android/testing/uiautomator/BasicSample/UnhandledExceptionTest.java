package com.example.android.testing.uiautomator.BasicSample;

import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Salome on 23.04.2017.
 */

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class UnhandledExceptionTest extends BaseUnitTest {

    @Test
    public void testUnhandledException() throws UiObjectNotFoundException {
        UiObject exceptionButton = mDevice.findObject(new UiSelector()
                .resourceId("io.selendroid.testapp:id/exceptionTestButton"));
        exceptionButton.isClickable();
        exceptionButton.click();
        assertNotNull(mDevice.findObject(new UiSelector().resourceId("android:id/alertTitle")));
        UiObject rebootButton = mDevice.findObject(new UiSelector().resourceId("android:id/aerr_restart"));
        rebootButton.isClickable();
        rebootButton.click();
    }

}
