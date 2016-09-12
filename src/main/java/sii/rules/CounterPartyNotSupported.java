package sii.rules;

import sii.model.Product;

public class CounterPartyNotSupported extends BaseRule implements TradeRule{
	public CounterPartyNotSupported(Product prod) {
		super(prod, "Counter Party not supported rule");
	}

	@Override
	public String validate(Product prod) {
		if(prod.getName()!= null){
			if( "PLUTO1".equals(prod.getName()) ||
				"PLUTO2".equals(prod.getName())	
					){
				return sucess();						
			}
			
		}
		return error();
	}

}
