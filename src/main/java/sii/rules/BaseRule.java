package sii.rules;

import sii.model.Product;

public class BaseRule{
	Product prod;
	protected String description;
	
	
	public BaseRule(Product prod, String description) {
		this.prod = prod;
		this.description = description;
	}

	
	public String error() {
		return description + " : "+ TradeRule.error + "  ";
	}
	public String sucess() {
		return description + " : "+ TradeRule.sucess+ " ";
	}

}
