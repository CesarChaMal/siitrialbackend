package sii.rules;

import sii.model.Product;

public class AmericanEuropeanStyle extends BaseRule implements TradeRule{
	public AmericanEuropeanStyle(Product prod) {
		super(prod, "American European Style");
	}

	@Override
	public String validate(Product prod) {
		if(prod.getStyle()!= null){
			if( "AMERICAN".equals(prod.getStyle()) ||
				"EUROPEAN".equals(prod.getStyle())
			){
				return sucess();						
			}
		}
		return error();
	}

}
