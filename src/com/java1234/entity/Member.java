package com.java1234.entity;

/**
 * ��Աʵ��
 * @author Administrator
 *
 */
public class Member {

	private Integer id; // ���
	private String memberName; // ��Ա��
	private String password; // ����
	private String trueName; // ��ʵ����
	private String email; // �ʼ�
	private String phone; // ��ϵ�绰
	private String roleName; // ��ɫ���� ϵͳ����Ա �������� �ͻ����� �߹�
	private String memberCode; //��Ա�ʺ�
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	
}
