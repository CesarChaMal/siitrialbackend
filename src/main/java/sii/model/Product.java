package sii.model;

import java.util.Date;

import sii.dto.TradeDTO;

public abstract class Product {
	private String style;
	private Date excerciseStartDate;
	
	private Date premiumDate;
	private Date deliveryDate;
	private Date expiryDate;

	
	private String name;
	private String type;
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Date getExcerciseStartDate() {
		return excerciseStartDate;
	}
	public void setExcerciseStartDate(Date excerciseStartDate) {
		this.excerciseStartDate = excerciseStartDate;
	}
	public Date getPremiumDate() {
		return premiumDate;
	}
	public void setPremiumDate(Date premiumDate) {
		this.premiumDate = premiumDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Product (String name,
			String type,
			Date valueDate,
			Date tradeDate,
			String currency,
			String style,
			Date expireDate,
			Date premiumDate,
			Date deliveryDate ){
		this.name = name;
		this.type = type;
		this.valueDate = valueDate; 
		this.tradeDate =tradeDate;
		this.currency= currency;
		this.style= style;
		this.expireDate= expireDate; 
		this.premiumDate= premiumDate; 
		this.deliveryDate=deliveryDate;
		 
	}
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Date valueDate;
	private Date tradeDate;
	private Date expireDate;

	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	private String currency;
	private String counterParty;
	
	public String getCounterParty() {
		return counterParty;
	}
	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public abstract TradeDTO validate();
	
	
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
}
