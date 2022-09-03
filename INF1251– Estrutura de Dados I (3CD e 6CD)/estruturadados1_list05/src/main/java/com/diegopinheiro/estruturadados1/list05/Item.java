package com.diegopinheiro.estruturadados1.list05;

public abstract class Item implements Comparable<Item>{
	
	public abstract String getId();
	

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Item) {
			Item otherItem = (Item) obj;
			return this.getId().equals(otherItem.getId());
		}
		return false;
	}
	
	@Override
	public int compareTo(Item o) {
		return this.getId().compareTo(o.getId());
	}
	
}
