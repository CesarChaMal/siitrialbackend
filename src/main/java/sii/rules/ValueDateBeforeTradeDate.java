package sii.rules;

import sii.model.Product;

public class ValueDateBeforeTradeDate extends BaseRule implements TradeRule{

	public ValueDateBeforeTradeDate(Product prod) {
		super(prod,"Value date must be before Trade date");
	}

	@Override
	public String validate(Product prod) {
		if (prod.getValueDate() != null && prod.getTradeDate() != null){
			if (prod.getValueDate().before(prod.getTradeDate())) {
				return sucess();
			}
		}
		return error();
		
	}

}
