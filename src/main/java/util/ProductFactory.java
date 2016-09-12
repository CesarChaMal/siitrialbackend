package util;

import java.util.Date;

import sii.model.Forward;
import sii.model.Options;
import sii.model.Product;
import sii.model.Spot;

public class ProductFactory {
		  	public Product createProduct(String name, String type, 
		  			 Date valueDate, 
					 Date tradeDate, 
					 String currency, 
					 String style, 
					 Date expireDate, 
					 Date premiumDate, 
					 Date deliveryDate
					){
		      if(type.equals("Option"))
		         return new Options(
		        		 name,
		        		 type,
			  			 valueDate, 
						 tradeDate, 
						 currency, 
						 style, 
						 expireDate, 
						 premiumDate, 
						 deliveryDate
		        		 
		        		 );
		      else if(type.equals("Forward"))
		         return new Forward(
		        		 name,
		        		 type,
			  			 valueDate, 
						 tradeDate, 
						 currency, 
						 style, 
						 expireDate, 
						 premiumDate, 
						 deliveryDate
		        		 
		        		 );
		      else if(type.equals("Spot"))
		    	  return new Spot(
			        		 name,
			        		 type,
				  			 valueDate, 
							 tradeDate, 
							 currency, 
							 style, 
							 expireDate, 
							 premiumDate, 
							 deliveryDate
			        		 
			        		 );
		      else
		         return null;
		   }
}

