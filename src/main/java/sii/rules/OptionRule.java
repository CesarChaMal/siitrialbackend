package sii.rules;

import sii.model.Options;
import sii.model.Product;
import util.Style;

public class OptionRule extends BaseRule implements TradeRule{
	public OptionRule(Options prod) {
		super(prod, "Date vs product type");
	}

	@Override
	public String validate(Product prod) {
		Options options = (Options) prod;
		if (isValidStyle(options.getStyle())){
			if(Style.AMERICAN.equals(options.getStyle())){
				
			}
			isExpiryAndPremiumBeforeDelivery(options);
		}
		return description;
	}
	
	private boolean isExpiryAndPremiumBeforeDelivery(Options options) {
		if( options.getExpireDate().before(options.getDeliveryDate())
				&&
			options.getPremiumDate().before(options.getDeliveryDate())
		){
			return true;
		}
		return false;
	}

	private boolean isValidStyle(String style) {
		for(Style aChoice : Style.values()) {
		      if(aChoice.toString() == style) {
		         return true;
		      }
		   }
		   return false;
	}

}
