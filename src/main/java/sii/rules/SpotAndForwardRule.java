package sii.rules;

import java.util.Date;

import sii.model.Product;

public class SpotAndForwardRule extends BaseRule implements TradeRule{
	public SpotAndForwardRule(Product prod) {
		super(prod, "Date vs product type rule");
	}

	@Override
	public String validate(Product prod) {
		if(prod.getDate()!= null){
		if( prod.getDate().after(new Date())  ){
				return sucess();						
		}
		}
		return error();
	}

}
