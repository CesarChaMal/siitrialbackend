package sii.app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sii.dto.TradeDTO;

@RestController
public class TradeRestController {

	@Autowired
	private TradeService tradeService;

    @CrossOrigin(origins = "http://localhost:9000")
	@RequestMapping("/trades")
	public TradeDTO validateTrade(
			@RequestParam(value="customername", defaultValue="") String name,
			@RequestParam(value="type", defaultValue="Forward") String type,
			@RequestParam(value="valueDate", defaultValue="10/10/10") Date valueDate, 
			@RequestParam(value="tradeDate", defaultValue="10/10/10") Date tradeDate, 
			@RequestParam(value="ccyPair", defaultValue="US") String currency, 
			@RequestParam(value="style", defaultValue="US") String style, 
			@RequestParam(value="expireDate", defaultValue="10/10/10") Date expireDate, 
			@RequestParam(value="premiumDate", defaultValue="10/10/10") Date premiumDate, 
			@RequestParam(value="deliveryDate", defaultValue="10/10/10") Date deliveryDate 
		) {
		TradeDTO trade = tradeService.validate(
				name,
				type,
				valueDate,
				tradeDate,
				currency,
				style,
				expireDate,
				premiumDate,
				deliveryDate
				);
		return trade;
	}

	
}
