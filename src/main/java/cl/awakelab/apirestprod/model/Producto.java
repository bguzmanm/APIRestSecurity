package cl.awakelab.apirestprod.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Producto {

	@Id
	private int product_id;
	
	private String product_name;
	private String description;
	private double standard_cost;
	private double list_price;
	
	public Producto() {
		
	}

	public Producto(int product_id, String product_name, String description, double standard_cost, double list_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.description = description;
		this.standard_cost = standard_cost;
		this.list_price = list_price;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getStandard_cost() {
		return standard_cost;
	}

	public void setStandard_cost(double standard_cost) {
		this.standard_cost = standard_cost;
	}

	public double getList_price() {
		return list_price;
	}

	public void setList_price(double list_price) {
		this.list_price = list_price;
	}
	
	
	
	
}
