package sii.rules;

import sii.model.Product;

public class ExpireAndPremiumBeforeDelivery extends BaseRule implements TradeRule{
	public ExpireAndPremiumBeforeDelivery(Product prod) {
		super(prod, "Expire and premium date before delivery date");
	}

	@Override
	public String validate(Product prod) {
		if (prod.getExpireDate() != null 
			&& prod.getPremiumDate()!= null
			){
			if(prod.getPremiumDate().before(prod.getDeliveryDate()) &&
			   prod.getExpireDate().before(prod.getDeliveryDate()))
					{
				return sucess();
			}
		}
		return error();
		
	}

}
