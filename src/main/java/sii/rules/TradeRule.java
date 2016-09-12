package sii.rules;

import sii.model.Product;

public interface TradeRule {
		String validate(Product regData);
		public static String sucess ="SUCESS";
		public static String error ="ERROR";
		
}
