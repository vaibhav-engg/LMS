package com.arisglobal.entity;

import java.sql.Date;
import javax.persistence.*;
@Entity
@Table(name="lms_transaction")
public class Transaction {
	@Id
	private int id;
	@Column(name="asset_id")
	private int asset_id;
	@Column(name="issue_date")
	private Date issue_date;
	@Column(name="due_date")
	private Date due_date;
	@Column(name="return_date")
	private Date return_date;
	@Column(name="created_date")
	private Date created_date;
	@Column(name="transaction_status")
	private int transaction_status;
	@Column(name="lms_user_id")
	private int lms_user_id;
	@Column(name="due_value")
	private double due_value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getTransaction_status() {
		return transaction_status;
	}

	public void setTransaction_status(int transaction_status) {
		this.transaction_status = transaction_status;
	}

	public int getLms_user_id() {
		return lms_user_id;
	}

	public void setLms_user_id(int lms_user_id) {
		this.lms_user_id = lms_user_id;
	}

	public double getDue_value() {
		return due_value;
	}

	public void setDue_value(double due_value) {
		this.due_value = due_value;
	}

	@Override
	public String toString() {
		return "LmsTransaction [id=" + id + ", asset_id=" + asset_id + ", issue_date=" + issue_date + ", due_date="
				+ due_date + ", return_date=" + return_date + ", created_date=" + created_date + ", transaction_status="
				+ transaction_status + ", lms_user_id=" + lms_user_id + ", due_value=" + due_value + "]";
	}

	public Transaction(int id, int asset_id, Date issue_date, Date due_date, Date return_date, Date created_date,
			int transaction_status, int lms_user_id, double due_value) {
		super();
		this.id = id;
		this.asset_id = asset_id;
		this.issue_date = issue_date;
		this.due_date = due_date;
		this.return_date = return_date;
		this.created_date = created_date;
		this.transaction_status = transaction_status;
		this.lms_user_id = lms_user_id;
		this.due_value = due_value;
	}

	public Transaction() {

	}
}
