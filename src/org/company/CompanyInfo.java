package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("ABCD");
	}
	public void companyId() {
		System.out.println("123456");
	}
	public void companyAddress() {
		System.out.println("Chennai");
	}
	public static void main(String[] args) {
		CompanyInfo details = new CompanyInfo();
		details.companyName();
		details.companyId();
		details.companyAddress();
	}
}