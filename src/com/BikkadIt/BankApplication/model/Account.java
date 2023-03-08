package com.BikkadIt.BankApplication.model;

public class Account {
			
		public int accntNo;
		public String accntName;
		public String address;
		public String panNo;
		public double amnt;


//Setter and getter for variables				
		public int getAccntNo() {
			return accntNo;
		}
		public void setAccntNo(int accntNo) {
			this.accntNo = accntNo;
		}
		public String getAccntName() {
			return accntName;
		}
		public void setAccntName(String accntName) {
			this.accntName =accntName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPanNo() {
			return panNo;
		}
		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}
		public double getAmnt() {
			return amnt;
		}
		public void setAmnt(double amnt) {
			this.amnt = amnt;
		}
		@Override
		public String toString() {
			return "Account [accntNo=" + accntNo + ", accntName=" + accntName + ", address=" + address + ", panNo="
					+ panNo + ", amnt=" + amnt + "]";
		}


}
