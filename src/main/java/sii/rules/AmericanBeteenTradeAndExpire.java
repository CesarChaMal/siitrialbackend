package sii.rules;

import sii.model.Product;

public class AmericanBeteenTradeAndExpire extends BaseRule implements TradeRule{
	public AmericanBeteenTradeAndExpire(Product prod) {
		super(prod, "American option style will have in addition the excerciseStartDate, which has to be after the trade date but before the expiry date");
	}

	@Override
	public String validate(Product prod) {
		if (prod.getExcerciseStartDate() != null){
			if(
					prod.getExcerciseStartDate().after(prod.getTradeDate())
					&&
					prod.getExcerciseStartDate().before(prod.getExpireDate())
					){
				return sucess();						
			}
		}
		return error();
	}

}
