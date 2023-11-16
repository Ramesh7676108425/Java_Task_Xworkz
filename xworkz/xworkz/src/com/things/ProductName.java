package com.things;

public class ProductName {
	int index=0;
	
	
	String[] ProductList=new String[5];
	
	public void onsave( String productName) {
		
		System.out.println("productName is:"+productName);
		if (index<ProductList.length) {
			ProductList[index]=productName;
			index++;
			
		}
		else {
			System.out.println("product list is full");
		}
	}
		public void getXyz() {
			for(int i=0;i<this.ProductList.length;i++) {
				System.out.println("product list is not full");
				
			}
		}
	}
	


