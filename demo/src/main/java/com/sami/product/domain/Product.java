package com.sami.product.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String productName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemid")
	Set<LineItem> items;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName,Set<LineItem> items) {
		this();
		this.productName = productName;
		this.items=items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Set<LineItem> getItems() {
		return items;
	}

	public void setItems(Set<LineItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}

}
