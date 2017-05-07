//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;
/**
 *
*/
public class CheckElementsOnHomeScreenTest {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\Salome\\workspace\\project2";
    protected Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "CheckElementsOnHomeScreenTest");
    }

    @Test
    public void testCheckElementsOnHomeScreenTest(){
        client.setDevice("adb:Nexus 5X");
        client.click("NATIVE", "xpath=//*[@id='workspace']", 0, 1);
        client.click("NATIVE", "xpath=//*[@contentDescription='Rakendused']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='selendroid-test-app']", 0, 1);
        client.verifyElementFound("NATIVE", "id=buttonTest", 0);
        client.verifyElementFound("NATIVE", "id=buttonStartWebview", 0);
        client.verifyElementFound("NATIVE", "id=startUserRegistration", 0);
        client.verifyElementFound("NATIVE", "id=my_text_field", 0);
        client.verifyElementFound("NATIVE", "id=waitingButtonTest", 0);
        client.verifyElementFound("NATIVE", "id=input_adds_check_box", 0);
        client.verifyElementFound("NATIVE", "id=visibleButtonTest", 0);
        client.verifyElementFound("NATIVE", "id=showToastButton", 0);
        client.verifyElementFound("NATIVE", "id=showPopupWindowButton", 0);
        client.verifyElementFound("NATIVE", "id=exceptionTestButton", 0);
        client.verifyElementFound("NATIVE", "id=exceptionTestField", 0);
        client.verifyElementFound("NATIVE", "id=topLevelElementTest", 0);
        client.verifyElementFound("NATIVE", "id=touchTest", 0);
    }

    @After
    public void tearDown(){
        // Generates a report of the test case.
        // For more information - https://docs.experitest.com/display/public/SA/Report+Of+Executed+Test
        client.generateReport(false);
        // Releases the client so that other clients can approach the agent in the near future. 
        client.releaseClient();
    }
}
