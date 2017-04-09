package com.sami.product.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LineItem {

	@Id
	@GeneratedValue
	Long id;
	String desc;
	Double price;

	public LineItem() {
		super();
	}

	public LineItem(String desc, Double price) {
		this();
		this.desc = desc;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LineItem [id=");
		builder.append(id);
		builder.append(", desc=");
		builder.append(desc);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
