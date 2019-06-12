package com.test.design.pattern;

public class Item {

	private String upcCode;
	private int price;

	public Item(String upc, int cost){
		this.upcCode=upc;
		this.price=cost;
	}
	
	public String getUpcCode() {
		return upcCode;
	}

	public int getPrice() {
		return price;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((upcCode == null) ? 0 : upcCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (price != other.price)
			return false;
		if (upcCode == null) {
			if (other.upcCode != null)
				return false;
		} else if (!upcCode.equals(other.upcCode))
			return false;
		return true;
	}

	
}