package sii.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TradeServiceTest {

	    @Autowired
	    private MockMvc mockMvc;

	    @Test
	    public void testTrades() throws Exception {

	        this.mockMvc.perform(get("/trades")).andDo(print()).andExpect(status().isOk());
	    }

	    @Test
	    public void testTradesSpot() throws Exception {
	    	this.mockMvc.perform(get(
	    	"/trades?type=Spot&customername=PLUTO1&ccyPair=EURUSD&direction=BUY&tradeDate=10/10/10&valueDate=10/11/10&currency=US&style=US&expireDate=10/10/10&premiumDate=10/10/10&deliveryDate=10/10/10"
	    	))
	    	.andDo(print()).andExpect(status().isOk());
	    }

	    @Test
	    public void testTradesForward() throws Exception {
	    	this.mockMvc.perform(get(
	    	"/trades?type=Forward&customername=PLUTO3&ccyPair=EURUSD&direction=BUY&tradeDate=10/10/10&valueDate=09/11/10&currency=USstyle=US&expireDate=10/10/10&premiumDate=10/10/10&deliveryDate=10/10/10"))
	    	.andDo(print()).andExpect(status().isOk());
	    }

	    @Test
	    public void testTradesOption() throws Exception {
	    	this.mockMvc.perform(get(
	    	"/trades?type=Option&customername=PLUTO1&ccyPair=EURUSD&direction=BUY&tradeDate=10/10/10&valueDate=10/10/10&currency=USstyle=US&expireDate=10/10/10&premiumDate=10/10/10&deliveryDate=10/10/10")).andDo(print()).andExpect(status().isOk());
	    }


	}
