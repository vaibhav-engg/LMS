package com.arisglobal.entity;
import java.sql.Date;

import javax.persistence.*;
@Entity
@Table(name="asset")
public class Asset {
	@Id
	private int asset_id;
	@Column(name = "asset_name")
	private String asset_name;
	@Column(name = "isbn_no")
    private int isbn_no ;
	@Column(name = "price")
    private double price;
	@Column(name = "category_id")
    private int category_id;
	@Column(name = "author_id")
    private int author_id;
	@Column(name = "created_date")
    private Date created_date;
	@Column(name = "asset_type")
    private String asset_type;
	@Column(name = "number_copies")
    private int number_copies;
	public int getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}
	public String getAsset_name() {
		return asset_name;
	}
	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}
	public int getIsbn_no() {
		return isbn_no;
	}
	public void setIsbn_no(int isbn_no) {
		this.isbn_no = isbn_no;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getAsset_type() {
		return asset_type;
	}
	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}
	public int getNumber_copies() {
		return number_copies;
	}
	public void setNumber_copies(int number_copies) {
		this.number_copies = number_copies;
	}
	@Override
	public String toString() {
		return "Asset [asset_id=" + asset_id + ", asset_name=" + asset_name + ", isbn_no=" + isbn_no + ", price="
				+ price + ", category_id=" + category_id + ", author_id=" + author_id + ", created_date=" + created_date
				+ ", asset_type=" + asset_type + ", number_copies=" + number_copies + "]";
	}
	public Asset(int asset_id, String asset_name, int isbn_no, double price, int category_id, int author_id,
			Date created_date, String asset_type, int number_copies) {
		super();
		this.asset_id = asset_id;
		this.asset_name = asset_name;
		this.isbn_no = isbn_no;
		this.price = price;
		this.category_id = category_id;
		this.author_id = author_id;
		this.created_date = created_date;
		this.asset_type = asset_type;
		this.number_copies = number_copies;
	}
	public Asset()
	{
		
	}
}
