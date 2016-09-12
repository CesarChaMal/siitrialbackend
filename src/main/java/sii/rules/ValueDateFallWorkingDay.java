package sii.rules;

import java.util.Calendar;
import java.util.GregorianCalendar;

import sii.model.Product;

public class ValueDateFallWorkingDay extends BaseRule implements TradeRule{
	public ValueDateFallWorkingDay(Product prod) {
		super(prod, "Value date not fall in working day");
	}

	@Override
	public String validate(Product prod) {
		if (prod.getValueDate() != null) {
		    GregorianCalendar dt = new GregorianCalendar();
		    dt.setTime(prod.getValueDate());
		    if (
		    	dt.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
		    	dt.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
		    	) {
		        return error();
		    }
		}
		return sucess();

	}
}
