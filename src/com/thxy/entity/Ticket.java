package com.thxy.entity;

import java.util.Date;

/**
 * ����СƱʵ��
 * 
 * @author Administrator
 *
 */
public class Ticket {

	private Integer id; // ���
	private String ticketCode; // СƱ��
	private Float totalMoney; // Ʊ���ܼ�
	private Date time; // Ʊ��ʱ��
	private String timeStr;// Ʊ��ʱ��
	
	private String goodsName;// ��Ʒ����
	private String model;// ��Ʒ�ͺ�
	private Integer goodsNum;// ��Ʒ����
	private Float price;// ��Ʒ�۸�
	private Float priceSum;// ����СƱ������Ʒ�ܼ�

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public Float getTotal() {
		return totalMoney;
	}

	public void setTotal(Float totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getTimeStr() {
		return timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
	}

	public Float getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Float totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getPriceSum() {
		return priceSum;
	}

	public void setPriceSum(Float priceSum) {
		this.priceSum = priceSum;
	}

}
