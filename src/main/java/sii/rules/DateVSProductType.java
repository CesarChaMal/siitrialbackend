package sii.rules;

import java.util.Date;

import sii.model.Product;

public class DateVSProductType extends BaseRule  implements TradeRule{
	public DateVSProductType(Product prod) {
		super(prod, "Date vs product type");
	}

	@Override
	public String validate(Product prod) {
		if(prod.getValueDate()!= null){
			if( prod.getValueDate().after(new Date())  ){
				return sucess();						
			}
		}
		return error();
	}

}
