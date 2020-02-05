package com.model;

import java.sql.Timestamp;
import java.sql.Date;

public class TransactionVO {

	
	private String agent_name;
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	private int transaction_id;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getVc_no() {
		return vc_no;
	}
	public void setVc_no(int vc_no) {
		this.vc_no = vc_no;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAgent_id() {
		return agent_id;
	}
	public void setAgent_id(int agent_id) {
		this.agent_id = agent_id;
	}
	public int getReceipt_no() {
		return receipt_no;
	}
	public void setReceipt_no(int receipt_no) {
		this.receipt_no = receipt_no;
	}
	public Date getTransactiontime() {
		return transactiontime;
	}
	public void setTransactiontime(Date transactiontime) {
		this.transactiontime = transactiontime;
	}
	public String getPkg() {
		return pkg;
	}
	public void setPkg(String pkg) {
		this.pkg = pkg;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getNofmonths() {
		return nofmonths;
	}
	public void setNofmonths(int nofmonths) {
		this.nofmonths = nofmonths;
	}
	public String getPaymentmethod() {
		return paymentmethod;
	}
	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}
	private int vc_no;
	private double amount;
	private int agent_id;
	private int receipt_no;
	private Date transactiontime; 
    private String pkg;
    private String remarks;
    private int nofmonths;
    private String paymentmethod;
    private Date nextDueDate;
	public Date getNextDueDate() {
		return nextDueDate;
	}
	public void setNextDueDate(Date nextDueDate) {
		this.nextDueDate = nextDueDate;
	}
}
