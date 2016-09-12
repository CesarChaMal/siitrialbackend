package sii.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sii.dto.TradeDTO;
import sii.rules.AmericanBeteenTradeAndExpire;
import sii.rules.AmericanEuropeanStyle;
import sii.rules.CounterPartyNotSupported;
import sii.rules.ExpireAndPremiumBeforeDelivery;
import sii.rules.ISOCurrencies;
import sii.rules.TradeRule;
import sii.rules.ValueDateBeforeTradeDate;
import sii.rules.ValueDateFallWeekend;
import sii.rules.ValueDateFallWorkingDay;


public class Options extends Product{

	public Options(String name, String type, Date valueDate, Date tradeDate, String currency, String style, Date expireDate, Date premiumDate, Date deliveryDate) {
		super(name, type,
	  			 valueDate, 
				 tradeDate, 
				 currency, 
				 style, 
				 expireDate, 
				 premiumDate, 
				 deliveryDate
       		 
				);
	}

	@Override
	public TradeDTO validate() {
		 List<TradeRule> rules = new ArrayList<>();
		 rules.add(new ValueDateBeforeTradeDate(this));
		 rules.add(new ValueDateFallWeekend(this));
		 rules.add(new ValueDateFallWorkingDay(this));
		 rules.add(new CounterPartyNotSupported(this) );
		 rules.add(new ISOCurrencies(this) );
		 
		 //only for options
		 rules.add(new AmericanEuropeanStyle(this) );
		 rules.add(new AmericanBeteenTradeAndExpire(this) );
		 rules.add(new ExpireAndPremiumBeforeDelivery(this) );
		 
		 List<Object> errors = new ArrayList<Object>();
		 
		 for (TradeRule tradeRule : rules) {
			errors.add(tradeRule.validate(this));
		}
		return  new TradeDTO(this.getName(),errors);
	}


}
