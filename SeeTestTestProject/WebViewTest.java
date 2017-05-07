//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;
/**
 *
*/
public class WebViewTest {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\Salome\\workspace\\project2";
    protected Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "WebViewTest");
    }

    @Test
    public void testWebViewTest(){
        client.setDevice("adb:Nexus 5X");
        client.click("NATIVE", "xpath=//*[@id='workspace']", 0, 1);
        client.click("NATIVE", "xpath=//*[@contentDescription='Rakendused']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='selendroid-test-app']", 0, 1);
        client.click("NATIVE", "xpath=//*[@id='buttonStartWebview']", 0, 1);
        client.click("NATIVE", "xpath=//*[@id='spinner_webdriver_test_data']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='formPage']", 0, 1);
        client.click("NATIVE", "xpath=//*[@id='spinner_webdriver_test_data']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text=concat('', \"'\", 'Say Hello', \"'\", '-Demo')]", 0, 1);
        client.click("NATIVE", "xpath=//*[@id='name_input']", 0, 1);
        client.click("NATIVE", "xpath=//*[@id='name_input']", 0, 1);
        client.sendText("{BKSP}");
        client.sendText("{BKSP}");
        client.sendText("Mary");
        if(client.waitForElement("NATIVE", "xpath=//*[@contentDescription='Volvo']", 0, 30000)){
            // If statement
        }
        client.click("NATIVE", "xpath=//*[@contentDescription='Volvo']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Audi']", 0, 1);
        client.click("NATIVE", "xpath=//*[@contentDescription='Send me your name!']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Go to home screen']", 0, 1);
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
