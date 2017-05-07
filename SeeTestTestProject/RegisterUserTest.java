//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;
/**
 *
*/
public class RegisterUserTest {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\Salome\\workspace\\project2";
    protected Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "RegisterUserTest");
    }

    @Test
    public void testRegisterUserTest(){
        client.setDevice("adb:Nexus 5X");
        client.click("NATIVE", "xpath=//*[@id='workspace']", 0, 1);
        client.click("NATIVE", "xpath=//*[@contentDescription='Rakendused']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='selendroid-test-app']", 0, 1);
        client.verifyElementFound("NATIVE", "xpath=//*[@id='waitingButtonTest']", 0);
        if(client.waitForElement("NATIVE", "xpath=//*[@text='Show Progress Bar for a while']", 0, 30000)){
            // If statement
        }
        client.click("NATIVE", "xpath=//*[@text='Show Progress Bar for a while']", 0, 1);
        client.verifyElementFound("NATIVE", "xpath=//*[@id='message']", 0);
        if(client.waitForElement("NATIVE", "xpath=//*[@id='inputUsername']", 0, 30000)){
            // If statement
        }
        client.click("NATIVE", "xpath=//*[@id='inputUsername']", 0, 1);
        client.elementSendText("NATIVE", "xpath=//*[@id='inputUsername']", 0, "MaryS");
        client.elementSendText("NATIVE", "xpath=//*[@id='inputEmail']", 0, "mary.starberry@notexist.com");
        client.elementSendText("NATIVE", "xpath=//*[@id='inputPassword']", 0, "12345");
        client.elementSendText("NATIVE", "xpath=//*[@id='inputName']", 0, "Mary");
        client.elementListSelect("", "id=input_preferedProgrammingLanguage", 0, false);
        client.click("NATIVE", "xpath=//*[@id='input_preferedProgrammingLanguage']", 0, 1);
        if(client.waitForElement("NATIVE", "xpath=//*[@text='Java']", 0, 30000)){
            // If statement
        }
        client.click("NATIVE", "xpath=//*[@text='Java']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='I accept adds']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Register User (verify)']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Register User']", 0, 1);
        client.verifyElementFound("NATIVE", "xpath=//*[@id='waitingButtonTest']", 0);
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
