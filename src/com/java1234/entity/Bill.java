package com.java1234.entity;

import java.util.Date;

/**
 * ����ʵ��
 * 
 * @author Administrator
 *
 */
public class Bill {

	private Integer id; // ���
	private String billCode; // �˵�����
	private String productName; // ��Ʒ����
	private String productDesc; // ��Ʒ����
	private String productUnit; // ��Ʒ��λ
	private Integer productCount; // ��Ʒ����
	private Integer totalPrice; // ��Ʒ�ܶ�
	private Integer isPayment; // �Ƿ�֧����1��δ֧�� 2����֧����
	private Integer createdBy; // �����ߣ�userId��
	private Date creationDate; // ����ʱ��
	private String creationDateStr;// ����ʱ�䣨�ַ�����
	private Integer modifyBy; // �����ߣ�userId��
	private Date modifyDate; // ����ʱ��
	private String modifyDateStr; // ����ʱ�䣨�ַ�����
	private String providerId; // ��Ӧ��ID

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getIsPayment() {
		return isPayment;
	}

	public void setIsPayment(Integer isPayment) {
		this.isPayment = isPayment;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getCreationDateStr() {
		return creationDateStr;
	}

	public void setCreationDateStr(String creationDateStr) {
		this.creationDateStr = creationDateStr;
	}

	public String getModifyDateStr() {
		return modifyDateStr;
	}

	public void setModifyDateStr(String modifyDateStr) {
		this.modifyDateStr = modifyDateStr;
	}

}
