//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;
/**
 *
*/
public class EnButtonTest {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\Salome\\workspace\\project2";
    protected Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "EnButtonTest");
    }

    @Test
    public void testEnButtonTest(){
        client.setDevice("adb:Nexus 5X");
        client.click("NATIVE", "xpath=//*[@id='workspace']", 0, 1);
        client.click("NATIVE", "xpath=//*[@contentDescription='Rakendused']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='selendroid-test-app']", 0, 1);
        if(client.waitForElement("NATIVE", "partial_text=EN Button", 0, 30000)){
            // If statement
        }
        client.verifyElementFound("NATIVE", "id=buttonTest", 0);
        client.click("NATIVE", "text=EN Button", 0, 1);
        client.verifyElementFound("NATIVE", "text=This will end the activity", 0);
        client.verifyElementFound("NATIVE", "id=button1", 0);
        client.verifyElementFound("NATIVE", "id=button2", 0);
        if(client.waitForElement("NATIVE", "partial_text=No, no", 0, 60000)){
            // If statement
        }
        client.click("NATIVE", "text=No, no", 0, 1);
        client.verifyElementFound("NATIVE", "id=buttonTest", 0);
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
