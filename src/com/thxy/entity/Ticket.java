package com.thxy.entity;

import java.util.Date;

/**
 * 收银小票实体
 * 
 * @author Administrator
 *
 */
public class Ticket {

	private Integer id; // 编号
	private String ticketCode; // 小票号
	private Float totalMoney; // 票面总价
	private Date time; // 票面时间
	private String timeStr;// 票面时间
	
	private String goodsName;// 商品名称
	private String model;// 商品型号
	private Integer goodsNum;// 商品数量
	private Float price;// 商品价格
	private Float priceSum;// 收银小票单个商品总价

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
