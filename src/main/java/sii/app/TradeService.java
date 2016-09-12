package sii.app;

import java.util.Date;

import sii.dto.TradeDTO;

public interface TradeService {

	TradeDTO validate(String name, 
			 String type,
			 Date valueDate, 
			 Date tradeDate, 
			 String currency, 
			 String style, 
			 Date expireDate, 
			 Date premiumDate, 
			 Date deliveryDate
			);

}
