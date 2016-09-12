package sii.rules;

import sii.model.Product;

public class ISOCurrencies extends BaseRule implements TradeRule{
	public ISOCurrencies(Product prod) {
		super(prod,"ISO currencies should be valid");
	}

	@Override
	public String validate(Product prod) {
		if(prod.getCurrency()!= null){
			if( "US".equals(prod.getCurrency()) ||
				"EUR".equals(prod.getCurrency())
			){
				return sucess();						
			}
		}
		return error();
	}

}
