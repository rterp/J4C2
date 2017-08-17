/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sumzerotrading.j4c2.Collective2Client;
import com.sumzerotrading.j4c2.FileApiKeyProvider;
import com.sumzerotrading.j4c2.signal.SignalInfo;
import com.sumzerotrading.j4c2.signal.SubmitSignalRequest;
import java.util.Properties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author RobTerpilowski
 */
public class Collective2ClientTest {
    
    public Collective2ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    @Ignore
    public void testRequest() {
        
        FileApiKeyProvider provider = new FileApiKeyProvider();
        Properties props = new Properties();
        props.setProperty(FileApiKeyProvider.PROPERTY_KEY, "/Users/RobTerpilowski/Documents/C2Key.txt");
        String apiKey = provider.getAPIKey(props);
        Collective2Client client = new Collective2Client(apiKey);

//        SystemRosterRequest request = new SystemRosterRequest();
//        
//        List<SystemDescriptor> list = client.getSystemRoster(request);
//        for( SystemDescriptor d : list ) {
//            if( ! "0".equals(d.getRecentlyInactiveSince())) {
//            System.out.println("inactive: " + d.getRecentlyInactiveSince() );
//            }
//        }


        String strategyId = "110073259";
        SignalInfo signal = new SignalInfo();
        
        signal.setAction(SignalInfo.Action.BTO);
        signal.setQuantity(100);
        signal.setTicker("QQQ");
        signal.setSymbolType(SignalInfo.SymbolType.stock);
        
        
        
        SubmitSignalRequest request  = new SubmitSignalRequest(strategyId, signal);
        client.submitTradeSignal(request);
    }

}
