package com.things;

public class ContactNumber {
	
	int index=0;
	
	int [] ContactList=new int [5];
	
	public void rrr(int ContactNumber) {
		System.out.println("ContactNumber is:"+ContactNumber);
		if(index<ContactList.length) {
			
			ContactList[index]=ContactNumber;
			index++;
			
		}
		else {
			System.out.println("ContactList is full");
		}
	}
	
	public void getxyz() {
		for (int i=0;i<this.ContactList.length;i++) {
			System.out.println("ContactList is not full");
		}
	}

}
