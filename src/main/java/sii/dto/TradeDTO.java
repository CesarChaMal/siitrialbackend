package sii.dto;

import java.util.List;

public class TradeDTO {
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	private String type;
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	private List<Object> errors;
	private long id;
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public TradeDTO(String name, List<Object> error) {
		this.name= name;
		this.errors = error;
	}


	public List<Object> getErrors() {
		return errors;
	}


	public void setErrors(List<Object> errors) {
		this.errors = errors;
	}



	
}
