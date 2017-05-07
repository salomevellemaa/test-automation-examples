//package <set your test package>;
import com.experitest.client.*;
import org.junit.*;
/**
 *
*/
public class UnhandledExceptionTest {
    private String host = "localhost";
    private int port = 8889;
    private String projectBaseDirectory = "C:\\Users\\Salome\\workspace\\project2";
    protected Client client = null;

    @Before
    public void setUp(){
        client = new Client(host, port, true);
        client.setProjectBaseDirectory(projectBaseDirectory);
        client.setReporter("xml", "reports", "UnhandledExceptionTest");
    }

    @Test
    public void testUnhandledExceptionTest(){
        client.setDevice("adb:Nexus 5X");
        client.click("NATIVE", "xpath=//*[@id='workspace']", 0, 1);
        client.click("NATIVE", "xpath=//*[@contentDescription='Rakendused']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='selendroid-test-app']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Press to throw unhandled exception']", 0, 1);
        client.click("NATIVE", "xpath=//*[@text='Ava rakendus uuesti']", 0, 1);
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
