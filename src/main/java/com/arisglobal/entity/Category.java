package com.arisglobal.entity;
import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name="category")
public class Category {
	@Id
	private int id;
	@Column(name="category_name")
	private String category_name;
	@Column(name="created_date")
	private Date created_Date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Date getCreated_Date() {
		return created_Date;
	}
	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", category_name=" + category_name + ", created_Date=" + created_Date + "]";
	}
	public Category(int id, String category_name, Date created_Date) {
		super();
		this.id = id;
		this.category_name = category_name;
		this.created_Date = created_Date;
	}
	public Category()
	{
		
	}
}
